package rest.elchoco.mesas.dom.service.dto;

import java.math.BigDecimal;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import rest.elchoco.mesas.openAPI.dto.TableCreateRDTO.StateEnum;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TableDTO {
	private String id;

	private String name;
	
	private String originalName;

	private String waiter;

	private BigDecimal price;
	
	private String place;

	private Boolean free;

	private StateEnum state;

	private List<ProductDTO> products = null;
}
