package rest.elchoco.mesas.dom.service.mapper;

import org.mapstruct.Mapper;

import rest.elchoco.mesas.dom.domain.Product;
import rest.elchoco.mesas.dom.domain.Table;
import rest.elchoco.mesas.dom.service.dto.ProductDTO;
import rest.elchoco.mesas.dom.service.dto.TableDTO;

@Mapper
public interface TableMapper {
		
	// from service to dom (Hexagonal architecture)
	Table tableDTOToTable(TableDTO tableDTO);
	Product productDTOToProduct(ProductDTO productDTO);
	
	TableDTO tableToTableDTO(Table table);
	ProductDTO productToProductDTO(Product product);
}
