package rest.elchoco.mesas.dom.service;

import java.util.List;

import rest.elchoco.mesas.dom.service.dto.TableDTO;

public interface TableService {

	List<TableDTO> findByPlace(String place);
	List<TableDTO> findByWaiter(String waiter);
	List<TableDTO> findByPlaceAndWaiter(String place, String waiter);
	List<TableDTO> findByName(String name);
	
	TableDTO findById(String id);
	
	TableDTO updateTable(String id, TableDTO tableDTO);
	
	TableDTO metodoPruebaPatronSAGA(String id, TableDTO tableDTO);
	TableDTO cashTable(String id, TableDTO tableDTO);
	TableDTO deleteTable(String id, TableDTO tableDTO);
}
