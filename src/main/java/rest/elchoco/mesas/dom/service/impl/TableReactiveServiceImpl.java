package rest.elchoco.mesas.dom.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.factory.Mappers;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import rest.elchoco.mesas.dom.domain.Table;
import rest.elchoco.mesas.dom.repository.TableReactiveRepository;
import rest.elchoco.mesas.dom.service.TableReactiveService;
import rest.elchoco.mesas.dom.service.dto.TableDTO;
import rest.elchoco.mesas.dom.service.mapper.TableMapper;

@Service
@AllArgsConstructor
public class TableReactiveServiceImpl implements TableReactiveService{
	
	TableReactiveRepository tableReactiveRepository;
	
	private final ApplicationEventPublisher publisher;
	
	private final TableMapper mapper = Mappers.getMapper(TableMapper.class);
	
	public Flux<TableDTO> findAll() {
		return tableReactiveRepository.findAll().map( table -> {
			return this.mapper.tableToTableDTO(table);
		});
	}
	
	public Mono<TableDTO> findById(String id){
		return tableReactiveRepository.findById(id).map(table -> {
			return this.mapper.tableToTableDTO(table);
		});

	}
	
	@Override
	public Mono<TableDTO> updateTable(String id, TableDTO tableDTO){
		Table tabMod = this.mapper.tableDTOToTable(tableDTO);
		return this.tableReactiveRepository
				.save(tabMod)
				.doOnSuccess(tab -> this.publisher.publishEvent(new TableUpdateEvent(tabMod)))
				.map(this.mapper::tableToTableDTO);
	}

	@Override
	public Flux<TableDTO> findAllProductsByStateInNotFreeTables(List<String> states) {
		
		return tableReactiveRepository.findByFreeAndProductStateIn(false, states).map(table -> {
			TableDTO tabDTO = this.mapper.tableToTableDTO(table);
			tabDTO.setProducts(new ArrayList<>());
			table.getProducts().forEach(prod -> {
				if(states.contains(prod.getState().getValue()))
					tabDTO.getProducts().add(mapper.productToProductDTO(prod));				
			});
			return tabDTO;
		});
	}
	
	@Override
	public TableDTO productsByStateInNotFreeTables(Table table, List<String> states) {

		TableDTO tabDTO = this.mapper.tableToTableDTO(table);
		tabDTO.setProducts(new ArrayList<>());
		table.getProducts().forEach(prod -> {
			if (states.contains(prod.getState().getValue()))
				tabDTO.getProducts().add(mapper.productToProductDTO(prod));
		});
		return tabDTO;

	}
	
	
	

}
