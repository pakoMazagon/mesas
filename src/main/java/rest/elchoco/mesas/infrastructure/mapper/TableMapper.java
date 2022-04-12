package rest.elchoco.mesas.infrastructure.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import rest.elchoco.mesas.dom.service.dto.ProductDTO;
import rest.elchoco.mesas.dom.service.dto.TableDTO;
import rest.elchoco.mesas.openAPI.dto.ProductKitchenRDTO;
import rest.elchoco.mesas.openAPI.dto.ProductRDTO;
import rest.elchoco.mesas.openAPI.dto.TableCreateRDTO;

@Mapper
public interface TableMapper {
		
	// from service to controller (Hexagonal architecture)
	TableCreateRDTO tableDTOToTableCreateRDTO(TableDTO tableDTO);
	ProductRDTO productDTOToProductRDTO(ProductDTO productDTO);
	
	TableDTO tableCreateRDTOToTableDTO(TableCreateRDTO tableCreateRDTO);
	ProductDTO productRDTOToProductDTO(ProductRDTO productRDTO);

	@Mappings({
	    @Mapping(target = "idTable", source = "tableDTO.id"),
	    @Mapping(target = "nameTable", source = "tableDTO.name"),
	    @Mapping(target = "originalNameTable", source = "tableDTO.originalName"),
	    @Mapping(target = "waiter", source = "tableDTO.waiter"),
	    @Mapping(target = "idProduct", source = "productDTO.id"),
	    @Mapping(target = "name", source = "productDTO.name"),
	    @Mapping(target = "amount", source = "productDTO.amount"),
	    @Mapping(target = "state", source = "productDTO.state"),
	  })
	ProductKitchenRDTO from(TableDTO tableDTO, ProductDTO productDTO);
}
