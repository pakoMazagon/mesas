package rest.elchoco.mesas.infrastructure.controller;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.factory.Mappers;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import rest.elchoco.mesas.dom.domain.Table;
import rest.elchoco.mesas.dom.service.TableReactiveService;
import rest.elchoco.mesas.dom.service.dto.TableDTO;
import rest.elchoco.mesas.dom.service.impl.TableUpdateEvent;
import rest.elchoco.mesas.infrastructure.mapper.TableMapper;

@RequestMapping("/tables")
@RestController
@CrossOrigin(origins = "*")
//@AllArgsConstructor
public class TableReactiveSentEventController {

	private final TableMapper mapper = Mappers.getMapper(TableMapper.class);
	
	private final TableReactiveService tableReactiveService;
	
	private final Flux<TableUpdateEvent> events;
	
	public TableReactiveSentEventController(TableReactiveService tableReactiveService, TableUpdateEventPublisher eventPublisher) {		
		this.tableReactiveService = tableReactiveService;
		this.events = Flux.create(eventPublisher).share();
	}
	
	
	@GetMapping(value= "waitingProductsInTablesNotFrees", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<TableDTO> finWaitingProductsInTablesNotFrees(){
		List<String> listStatesProducts = new ArrayList<>();
		listStatesProducts.add("POR_PEDIR");	
		listStatesProducts.add("PEDIDO_A_COCINA");
		listStatesProducts.add("EN_MARCHA_COCINA");
		//Flux<TableDTO> listDev = this.tableReactiveService.findAllProductsByStateInNotFreeTables(listStatesProducts);		
		return this.events.map( tableEv -> {
			if(tableEv.getSource() instanceof Table) {
				return this.tableReactiveService.productsByStateInNotFreeTables((Table) tableEv.getSource(), listStatesProducts); 				
			}	
			return TableDTO.builder().build();
		});
	}
}
