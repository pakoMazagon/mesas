package rest.elchoco.mesas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.github.cloudyrock.spring.v5.EnableMongock;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableMongock
@EnableEurekaClient
//@EnableWebFlux
public class MesasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MesasApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
//	@Bean 
//	RouterFunction<ServerResponse> routerFunction(){
//		return route(GET("/waitingProductsInTablesNotFrees"), request -> {
//			
//		}); 
//	}

}
