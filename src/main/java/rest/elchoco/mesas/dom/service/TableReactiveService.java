package rest.elchoco.mesas.dom.service;

import java.util.List;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import rest.elchoco.mesas.dom.domain.Table;
import rest.elchoco.mesas.dom.service.dto.TableDTO;

public interface TableReactiveService {

	Flux<TableDTO> findAll();
	Mono<TableDTO> updateTable(String id, TableDTO tableDTO);
	Flux<TableDTO> findAllProductsByStateInNotFreeTables(List<String> states);
	TableDTO productsByStateInNotFreeTables(Table table, List<String> states);
}
