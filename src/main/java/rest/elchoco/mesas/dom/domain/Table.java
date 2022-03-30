package rest.elchoco.mesas.dom.domain;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import rest.elchoco.mesas.openAPI.dto.TableCreateRDTO.StateEnum;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection ="mesa")
public class Table {
	
	@Id
	private String id;

	private String name;
	
	private String originalName;

	private String waiter;

	private BigDecimal price;
	
	private String place;

	private Boolean free;

	private StateEnum state;

	private List<Product> products;
}
