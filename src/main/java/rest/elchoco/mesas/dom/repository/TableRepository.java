package rest.elchoco.mesas.dom.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import rest.elchoco.mesas.dom.domain.Table;

public interface TableRepository extends MongoRepository<Table, String>{
	
	List<Table> findByPlace(String place);
	List<Table> findByWaiter(String waiter);
	List<Table> findByPlaceAndWaiter(String place, String waiter);
	List<Table> findByName(String name);
}
