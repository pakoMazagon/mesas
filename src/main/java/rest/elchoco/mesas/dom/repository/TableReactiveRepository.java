package rest.elchoco.mesas.dom.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import reactor.core.publisher.Flux;
import rest.elchoco.mesas.dom.domain.Table;

public interface TableReactiveRepository extends ReactiveMongoRepository<Table, String>{
	@Query("{ 'free' : false,'products.state' : {'$in': ?1}}")
	Flux<Table> findByFreeAndProductStateIn(Boolean free, List<String> states);
}
