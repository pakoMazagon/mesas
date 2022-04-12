package rest.elchoco.mesas.dom.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import reactor.core.publisher.Flux;
import rest.elchoco.mesas.dom.domain.Table;
import rest.elchoco.mesas.dom.service.dto.TableDTO;

public interface TableRepository extends MongoRepository<Table, String>{
	
	List<Table> findByPlace(String place);
	List<Table> findByWaiter(String waiter);
	List<Table> findByPlaceAndWaiter(String place, String waiter);
	List<Table> findByName(String name);
	List<Table> findByPlaceAndWaiterOrFree(String place, String waiter, Boolean free);	
	
	@Query("{ 'free' : false,'products.state' : {'$in': ?1}}")
	List<Table> findByFreeAndProductStateIn(Boolean free, List<String> states);
}
