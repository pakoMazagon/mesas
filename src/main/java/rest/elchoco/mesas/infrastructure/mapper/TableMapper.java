package rest.elchoco.mesas.infrastructure.mapper;

import org.mapstruct.Mapper;

import rest.elchoco.mesas.dom.service.dto.ProductDTO;
import rest.elchoco.mesas.dom.service.dto.TableDTO;
import rest.elchoco.mesas.openAPI.dto.ProductRDTO;
import rest.elchoco.mesas.openAPI.dto.TableCreateRDTO;

@Mapper
public interface TableMapper {
		
	// from service to controller (Hexagonal architecture)
	TableCreateRDTO tableDTOToTableCreateRDTO(TableDTO tableDTO);
	ProductRDTO productDTOToProductRDTO(ProductDTO productDTO);
	
	TableDTO tableCreateRDTOToTableDTO(TableCreateRDTO tableCreateRDTO);
	ProductDTO productRDTOToProductDTO(ProductRDTO productRDTO);
}
