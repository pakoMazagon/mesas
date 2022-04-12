package rest.elchoco.mesas.infrastructure.controller;

import javax.validation.Valid;

import org.mapstruct.factory.Mappers;
import org.reactivestreams.Publisher;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;
import rest.elchoco.mesas.dom.service.TableReactiveService;
import rest.elchoco.mesas.dom.service.dto.TableDTO;
import rest.elchoco.mesas.infrastructure.mapper.TableMapper;
import rest.elchoco.mesas.openAPI.dto.TableCreateRDTO;

@RestController 
@RequestMapping(value = "/tables", produces = MediaType.APPLICATION_JSON_VALUE) 
@AllArgsConstructor
@CrossOrigin(origins = "*")
@Slf4j
public class TableReactiveController {

	private final TableMapper mapper = Mappers.getMapper(TableMapper.class);
	
	private final TableReactiveService tableReactiveService;
	
	private final MediaType mediaType = MediaType.APPLICATION_JSON_UTF8;
	
	@PutMapping("/tablesReactives/{id}")
	public Publisher<ResponseEntity<TableCreateRDTO>> updateTable(@PathVariable("id") String id, @Valid @RequestBody TableCreateRDTO body) {
		TableDTO tableDTO = mapper.tableCreateRDTOToTableDTO(body);
//		tableDTO = tableReactiveService.updateTable(id, tableDTO);
//		TableCreateRDTO tableDev = mapper.tableDTOToTableCreateRDTO(tableDTO);
//		return ResponseEntity.ok(tableDev);
		return Mono.just(mapper.tableDTOToTableCreateRDTO(tableDTO))
				.flatMap(t -> this.tableReactiveService.updateTable(id, tableDTO))
//				.map( t -> ResponseEntity.ok().contentType(this.mediaType).build());
		.map( t -> ResponseEntity.ok(mapper.tableDTOToTableCreateRDTO(t)));
	}
}
