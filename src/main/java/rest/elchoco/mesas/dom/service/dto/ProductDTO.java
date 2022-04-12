package rest.elchoco.mesas.dom.service.dto;

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
public class ProductDTO {

	private String id;
	
	private String name;

	private BigDecimal amount;

	private BigDecimal price;

	private String place;
	
	private StateEnum state;
	
	private Boolean kitchen;
	
	private TableDTO tableDTO;
}
