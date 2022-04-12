//package rest.elchoco.mesas.reactivos.service;
//
//import java.util.function.Predicate;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
//
//import reactor.core.publisher.Flux;
//import reactor.test.StepVerifier;
//import rest.elchoco.mesas.dom.domain.Table;
//import rest.elchoco.mesas.dom.repository.TableReactiveRepository;
//import rest.elchoco.mesas.dom.service.TableReactiveService;
//
//@DataMongoTest
////@Import(ProfileService.class)
//public class TableServiceTest {
//
//	private final TableReactiveService service;
//	private final TableReactiveRepository repository;
//	
//	
//	
//	public TableServiceTest(@Autowired TableReactiveService service, @Autowired TableReactiveRepository repository) {
//		this.service = service;
//		this.repository = repository;
//	}
//
//
//
//	@Test 
//    public void getAll() {
//        Flux<Table> saved = repository.saveAll(Flux.just(Table.builder().name("TEST").build()));
//
//        Flux<Table> composite = service.findAll().thenMany(saved);
//
//        Predicate<Table> match = table -> saved.any(saveItem -> saveItem.equals(table)).block();
//
//        StepVerifier
//            .create(composite) 
//            .expectNextMatches(match)  
//            .expectNextMatches(match)
//            .expectNextMatches(match)
//            .verifyComplete(); 
//    }
//}
