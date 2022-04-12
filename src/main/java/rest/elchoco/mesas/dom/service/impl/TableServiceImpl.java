package rest.elchoco.mesas.dom.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import rest.elchoco.mesas.dom.domain.Table;
import rest.elchoco.mesas.dom.repository.TableRepository;
import rest.elchoco.mesas.dom.service.TableService;
import rest.elchoco.mesas.dom.service.dto.ProductDTO;
import rest.elchoco.mesas.dom.service.dto.TableDTO;
import rest.elchoco.mesas.dom.service.mapper.TableMapper;

@Service
@AllArgsConstructor
public class TableServiceImpl implements TableService{

	TableRepository tableRepository;
	
	private final TableMapper mapper = Mappers.getMapper(TableMapper.class);;
	
	@Override
	public List<TableDTO> findByPlace(String place) {
		List<TableDTO> listTablesDTOs = tableRepository.findByPlace(place).stream()
			.map( tabl -> {
					return this.mapper.tableToTableDTO(tabl);
				}).collect(Collectors.toList());
		return listTablesDTOs;
	}

	@Override
	public List<TableDTO> findByWaiter(String waiter) {
		return tableRepository.findByWaiter(waiter).stream()
			.map( tabl -> {
					return this.mapper.tableToTableDTO(tabl);
				}).collect(Collectors.toList());		
	}

	@Override
	public List<TableDTO> findByPlaceAndWaiter(String place, String waiter, Boolean includeFrees) {
		List<Table> listTables;
		if(includeFrees == null || !includeFrees) {
			listTables = tableRepository.findByPlaceAndWaiter(place, waiter);
		}
		else {
			listTables = tableRepository.findByPlaceAndWaiterOrFree(place,waiter, includeFrees);
		}
			
		return listTables.stream()
			.map( tabl -> {
					return this.mapper.tableToTableDTO(tabl);
				}).collect(Collectors.toList());
	}

	@Override
	public List<TableDTO> findByName(String name) {
		return tableRepository.findByName(name).stream()
			.map( tabl -> {
					return this.mapper.tableToTableDTO(tabl);
				}).collect(Collectors.toList());		
	}

	@Override
	public TableDTO findById(String id) {
		Optional<Table> tablOpt = tableRepository.findById(id);
		TableDTO tablDTO = tablOpt.isEmpty() ? null:this.mapper.tableToTableDTO(tablOpt.get());
		return tablDTO;
	}

	@Override
	public TableDTO updateTable(String id, TableDTO tableDTO) {
//		Optional<Table> tablOpt = tableRepository.findById(id);
		Table tabMod = this.mapper.tableDTOToTable(tableDTO);
//		tabMod.setId(tablOpt.get().getId());
		tabMod = tableRepository.save(tabMod);
		return this.mapper.tableToTableDTO(tabMod);
	}

	@Override
	public TableDTO metodoPruebaPatronSAGA(String id, TableDTO tableDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TableDTO cashTable(String id, TableDTO tableDTO) {
		Table tabMod = this.mapper.tableDTOToTable(tableDTO);
		//TODO SEND TO KAFKA TOTAL OF AMOUNT
		tabMod = clearTable(tabMod);
		return this.mapper.tableToTableDTO(tabMod);
	}

	@Override
	public TableDTO deleteTable(String id, TableDTO tableDTO) {
		Table tabMod = this.mapper.tableDTOToTable(tableDTO);
		tabMod = clearTable(tabMod);
		return this.mapper.tableToTableDTO(tabMod);
	}

	private Table clearTable(Table tabMod) {
		tabMod.setFree(true);
		tabMod.setName("");
		tabMod.setPrice(BigDecimal.ZERO);
		tabMod.setProducts(null);
		tabMod.setWaiter("");
		return this.tableRepository.save(tabMod);
	}
	
	@Override
	public List<TableDTO> findAllProductsByStateInNotFreeTables(List<String> states){
		return tableRepository.findByFreeAndProductStateIn(false, states).stream().map(table -> {
			TableDTO tabDTO = this.mapper.tableToTableDTO(table);
			tabDTO.setProducts(new ArrayList<>());
			table.getProducts().forEach(prod -> {
				if(states.contains(prod.getState().getValue())) {
					ProductDTO pDTO = mapper.productToProductDTO(prod);
					pDTO.setTableDTO(tabDTO);
					tabDTO.getProducts().add(pDTO);
				}
									
			});
			return tabDTO;
		}).collect(Collectors.toList());
	}

}
