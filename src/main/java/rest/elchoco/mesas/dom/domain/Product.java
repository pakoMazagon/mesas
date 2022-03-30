package rest.elchoco.mesas.dom.domain;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import rest.elchoco.mesas.openAPI.dto.ProductRDTO.StateEnum;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	private String id;
	
	private String name;

	private BigDecimal amount;

	private BigDecimal price;

	private String place;
	
	private StateEnum state;
}
