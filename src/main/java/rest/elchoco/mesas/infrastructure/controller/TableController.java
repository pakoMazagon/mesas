package rest.elchoco.mesas.infrastructure.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.mapstruct.factory.Mappers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import rest.elchoco.mesas.dom.service.TableService;
import rest.elchoco.mesas.dom.service.dto.TableDTO;
import rest.elchoco.mesas.infrastructure.mapper.TableMapper;
import rest.elchoco.mesas.openAPI.controller.TablesApi;
import rest.elchoco.mesas.openAPI.dto.TableCreateRDTO;

//@CrossOrigin(origins = "*")
@Slf4j
@RequestMapping("")
@RestController
@AllArgsConstructor
public class TableController implements TablesApi {
	
	private final TableMapper mapper = Mappers.getMapper(TableMapper.class);
	
	private final TableService tableService;
	
	@Override
	public Optional<NativeWebRequest> getRequest() {
		// TODO Auto-generated method stub
		return TablesApi.super.getRequest();
	}

	@Override
	public ResponseEntity<List<TableCreateRDTO>> findAllTables() {		
		return TablesApi.super.findAllTables();
	}

	@Override
	public ResponseEntity<List<TableCreateRDTO>> findAllTablesByPlace(String terraceOrSalonOrBarra) {
		List<TableDTO> listTables = tableService.findByPlace(terraceOrSalonOrBarra);
		
		List<TableCreateRDTO> listTablesDev = parseListTableDTOToTableCreateRDTO(listTables);
		return ResponseEntity.ok(listTablesDev);
	}

	@Override
	public ResponseEntity<List<TableCreateRDTO>> findAllTablesByPlaceAndWaiterCode(String terraceOrSalonOrBarra, String waiterCode) {
		List<TableDTO> listTables = tableService.findByPlaceAndWaiter(terraceOrSalonOrBarra, waiterCode);
		
		List<TableCreateRDTO> listTablesDev = parseListTableDTOToTableCreateRDTO(listTables);
		return ResponseEntity.ok(listTablesDev);
	}

	@Override
	public ResponseEntity<List<TableCreateRDTO>> findTablesByName(String name) {
		List<TableDTO> listTables = tableService.findByName(name);
		
		List<TableCreateRDTO> listTablesDev = parseListTableDTOToTableCreateRDTO(listTables);		
		return ResponseEntity.ok(listTablesDev);
	}

	@Override
	public ResponseEntity<Void> tablesByNameNameDelete(String name) {
		// TODO Auto-generated method stub
		return TablesApi.super.tablesByNameNameDelete(name);
	}
	
	
	private List<TableCreateRDTO> parseListTableDTOToTableCreateRDTO(List<TableDTO> listTables){
		return listTables.stream().map(table -> {
			return mapper.tableDTOToTableCreateRDTO(table);
		}).collect(Collectors.toList());
	}

	@Override
	public ResponseEntity<TableCreateRDTO> findTableById(String id) {
		
		return ResponseEntity.ok(mapper.tableDTOToTableCreateRDTO(tableService.findById(id)));
	}

	@Override
	public ResponseEntity<TableCreateRDTO> updateTable(String id, @Valid TableCreateRDTO body) {
		TableDTO tableDTO = mapper.tableCreateRDTOToTableDTO(body);
		tableDTO = tableService.updateTable(id, tableDTO);
		TableCreateRDTO tableDev = mapper.tableDTOToTableCreateRDTO(tableDTO);
		return ResponseEntity.ok(tableDev);
	}

	@Override
	public ResponseEntity<TableCreateRDTO> cashTable(String id, @Valid TableCreateRDTO body) {
		
		TableDTO tableDTO = mapper.tableCreateRDTOToTableDTO(body);
		tableDTO = tableService.cashTable(id, tableDTO);
		TableCreateRDTO tableDev = mapper.tableDTOToTableCreateRDTO(tableDTO);
		return ResponseEntity.ok(tableDev);
	}

	@Override
	public ResponseEntity<TableCreateRDTO> deleteTable(String id, @Valid TableCreateRDTO body) {		
		TableDTO tableDTO = mapper.tableCreateRDTOToTableDTO(body);
		tableDTO = tableService.deleteTable(id, tableDTO);
		TableCreateRDTO tableDev = mapper.tableDTOToTableCreateRDTO(tableDTO);
		return ResponseEntity.ok(tableDev);
	}
	
	

}
