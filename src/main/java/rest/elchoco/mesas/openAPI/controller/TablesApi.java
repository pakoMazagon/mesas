/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package rest.elchoco.mesas.openAPI.controller;

import rest.elchoco.mesas.openAPI.dto.ErrorResponseRDTO;
import rest.elchoco.mesas.openAPI.dto.TableCreateRDTO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-30T13:23:45.743486700+02:00[Europe/Paris]")
@Validated
@Api(value = "tables", description = "the tables API")
public interface TablesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * PUT /tables/byId/cash/{id} : Update or create an existing table
     *
     * @param id id (required)
     * @param body Table object that needs to be update (required)
     * @return Tableo completo con todas propiedades (status code 200)
     *         or En caso de que no se envien los datos necesarios para realizar la operación o los mismos tengan un formato erroneo (status code 400)
     *         or En caso de error general en el servidor (status code 500)
     */
    @ApiOperation(value = "Update or create an existing table", nickname = "cashTable", notes = "", response = TableCreateRDTO.class, authorizations = {
        
        @Authorization(value = "x-jwt-assertion")
         }, tags={ "table", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Tableo completo con todas propiedades", response = TableCreateRDTO.class),
        @ApiResponse(code = 400, message = "En caso de que no se envien los datos necesarios para realizar la operación o los mismos tengan un formato erroneo", response = ErrorResponseRDTO.class),
        @ApiResponse(code = 500, message = "En caso de error general en el servidor", response = ErrorResponseRDTO.class) })
    @PutMapping(
        value = "/tables/byId/cash/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<TableCreateRDTO> cashTable(@ApiParam(value = "id",required=true) @PathVariable("id") String id,@ApiParam(value = "Table object that needs to be update" ,required=true )  @Valid @RequestBody TableCreateRDTO body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"originalName\" : \"originalName\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\", \"waiter\" : \"waiter\", \"place\" : \"place\", \"state\" : \"POR_COGER_COMANDA\", \"free\" : true, \"products\" : [ { \"amount\" : \"\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\", \"place\" : \"place\", \"state\" : \"POR_PEDIR\" }, { \"amount\" : \"\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\", \"place\" : \"place\", \"state\" : \"POR_PEDIR\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /tables/byId/delete/{id} : Update or create an existing table
     *
     * @param id id (required)
     * @param body Table object that needs to be update (required)
     * @return Tableo completo con todas propiedades (status code 200)
     *         or En caso de que no se envien los datos necesarios para realizar la operación o los mismos tengan un formato erroneo (status code 400)
     *         or En caso de error general en el servidor (status code 500)
     */
    @ApiOperation(value = "Update or create an existing table", nickname = "deleteTable", notes = "", response = TableCreateRDTO.class, authorizations = {
        
        @Authorization(value = "x-jwt-assertion")
         }, tags={ "table", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Tableo completo con todas propiedades", response = TableCreateRDTO.class),
        @ApiResponse(code = 400, message = "En caso de que no se envien los datos necesarios para realizar la operación o los mismos tengan un formato erroneo", response = ErrorResponseRDTO.class),
        @ApiResponse(code = 500, message = "En caso de error general en el servidor", response = ErrorResponseRDTO.class) })
    @PutMapping(
        value = "/tables/byId/delete/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<TableCreateRDTO> deleteTable(@ApiParam(value = "id",required=true) @PathVariable("id") String id,@ApiParam(value = "Table object that needs to be update" ,required=true )  @Valid @RequestBody TableCreateRDTO body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"originalName\" : \"originalName\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\", \"waiter\" : \"waiter\", \"place\" : \"place\", \"state\" : \"POR_COGER_COMANDA\", \"free\" : true, \"products\" : [ { \"amount\" : \"\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\", \"place\" : \"place\", \"state\" : \"POR_PEDIR\" }, { \"amount\" : \"\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\", \"place\" : \"place\", \"state\" : \"POR_PEDIR\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /tables : Find all tables
     * Find List of tables
     *
     * @return Respuesta tableCreate (status code 200)
     *         or En caso de que no se envien los datos necesarios para realizar la operación o los mismos tengan un formato erroneo (status code 400)
     *         or En caso de error general en el servidor (status code 500)
     */
    @ApiOperation(value = "Find all tables", nickname = "findAllTables", notes = "Find List of tables", response = TableCreateRDTO.class, responseContainer = "List", authorizations = {
        
        @Authorization(value = "x-jwt-assertion")
         }, tags={ "table", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Respuesta tableCreate", response = TableCreateRDTO.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "En caso de que no se envien los datos necesarios para realizar la operación o los mismos tengan un formato erroneo", response = ErrorResponseRDTO.class),
        @ApiResponse(code = 500, message = "En caso de error general en el servidor", response = ErrorResponseRDTO.class) })
    @GetMapping(
        value = "/tables",
        produces = { "application/json" }
    )
    default ResponseEntity<List<TableCreateRDTO>> findAllTables() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"originalName\" : \"originalName\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\", \"waiter\" : \"waiter\", \"place\" : \"place\", \"state\" : \"POR_COGER_COMANDA\", \"free\" : true, \"products\" : [ { \"amount\" : \"\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\", \"place\" : \"place\", \"state\" : \"POR_PEDIR\" }, { \"amount\" : \"\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\", \"place\" : \"place\", \"state\" : \"POR_PEDIR\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /tables/byPlace/{terraceOrSalonOrBarra} : Find all tables by place
     * t is terrace and s is salon b is barra
     *
     * @param terraceOrSalonOrBarra t is terrace and s is salon or b is barra (required)
     * @return Respuesta tableCreate (status code 200)
     *         or En caso de que no se envien los datos necesarios para realizar la operación o los mismos tengan un formato erroneo (status code 400)
     *         or En caso de error general en el servidor (status code 500)
     */
    @ApiOperation(value = "Find all tables by place", nickname = "findAllTablesByPlace", notes = "t is terrace and s is salon b is barra", response = TableCreateRDTO.class, responseContainer = "List", authorizations = {
        
        @Authorization(value = "x-jwt-assertion")
         }, tags={ "table", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Respuesta tableCreate", response = TableCreateRDTO.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "En caso de que no se envien los datos necesarios para realizar la operación o los mismos tengan un formato erroneo", response = ErrorResponseRDTO.class),
        @ApiResponse(code = 500, message = "En caso de error general en el servidor", response = ErrorResponseRDTO.class) })
    @GetMapping(
        value = "/tables/byPlace/{terraceOrSalonOrBarra}",
        produces = { "application/json" }
    )
    default ResponseEntity<List<TableCreateRDTO>> findAllTablesByPlace(@ApiParam(value = "t is terrace and s is salon or b is barra",required=true) @PathVariable("terraceOrSalonOrBarra") String terraceOrSalonOrBarra) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"originalName\" : \"originalName\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\", \"waiter\" : \"waiter\", \"place\" : \"place\", \"state\" : \"POR_COGER_COMANDA\", \"free\" : true, \"products\" : [ { \"amount\" : \"\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\", \"place\" : \"place\", \"state\" : \"POR_PEDIR\" }, { \"amount\" : \"\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\", \"place\" : \"place\", \"state\" : \"POR_PEDIR\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /tables/byPlaceAndWaiter/{terraceOrSalonOrBarra}/{waiterCode} : Find all tables by place and waiter
     * t is terrace and s is salon and familyCode
     *
     * @param terraceOrSalonOrBarra t is terrace and s is salon b is barra (required)
     * @param waiterCode WaiterCode value that need to be considered for filter (required)
     * @return Respuesta tableCreate (status code 200)
     *         or En caso de que no se envien los datos necesarios para realizar la operación o los mismos tengan un formato erroneo (status code 400)
     *         or En caso de error general en el servidor (status code 500)
     */
    @ApiOperation(value = "Find all tables by place and waiter", nickname = "findAllTablesByPlaceAndWaiterCode", notes = "t is terrace and s is salon and familyCode", response = TableCreateRDTO.class, responseContainer = "List", authorizations = {
        
        @Authorization(value = "x-jwt-assertion")
         }, tags={ "table", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Respuesta tableCreate", response = TableCreateRDTO.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "En caso de que no se envien los datos necesarios para realizar la operación o los mismos tengan un formato erroneo", response = ErrorResponseRDTO.class),
        @ApiResponse(code = 500, message = "En caso de error general en el servidor", response = ErrorResponseRDTO.class) })
    @GetMapping(
        value = "/tables/byPlaceAndWaiter/{terraceOrSalonOrBarra}/{waiterCode}",
        produces = { "application/json" }
    )
    default ResponseEntity<List<TableCreateRDTO>> findAllTablesByPlaceAndWaiterCode(@ApiParam(value = "t is terrace and s is salon b is barra",required=true) @PathVariable("terraceOrSalonOrBarra") String terraceOrSalonOrBarra,@ApiParam(value = "WaiterCode value that need to be considered for filter",required=true) @PathVariable("waiterCode") String waiterCode) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"originalName\" : \"originalName\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\", \"waiter\" : \"waiter\", \"place\" : \"place\", \"state\" : \"POR_COGER_COMANDA\", \"free\" : true, \"products\" : [ { \"amount\" : \"\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\", \"place\" : \"place\", \"state\" : \"POR_PEDIR\" }, { \"amount\" : \"\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\", \"place\" : \"place\", \"state\" : \"POR_PEDIR\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /tables/byId/{id} : Find tables by id
     * Find tables by id
     *
     * @param id id (required)
     * @return Tableo completo con todas propiedades (status code 200)
     *         or En caso de que no se envien los datos necesarios para realizar la operación o los mismos tengan un formato erroneo (status code 400)
     *         or En caso de error general en el servidor (status code 500)
     */
    @ApiOperation(value = "Find tables by id", nickname = "findTableById", notes = "Find tables by id", response = TableCreateRDTO.class, authorizations = {
        
        @Authorization(value = "x-jwt-assertion")
         }, tags={ "table", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Tableo completo con todas propiedades", response = TableCreateRDTO.class),
        @ApiResponse(code = 400, message = "En caso de que no se envien los datos necesarios para realizar la operación o los mismos tengan un formato erroneo", response = ErrorResponseRDTO.class),
        @ApiResponse(code = 500, message = "En caso de error general en el servidor", response = ErrorResponseRDTO.class) })
    @GetMapping(
        value = "/tables/byId/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<TableCreateRDTO> findTableById(@ApiParam(value = "id",required=true) @PathVariable("id") String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"originalName\" : \"originalName\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\", \"waiter\" : \"waiter\", \"place\" : \"place\", \"state\" : \"POR_COGER_COMANDA\", \"free\" : true, \"products\" : [ { \"amount\" : \"\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\", \"place\" : \"place\", \"state\" : \"POR_PEDIR\" }, { \"amount\" : \"\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\", \"place\" : \"place\", \"state\" : \"POR_PEDIR\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /tables/byName/{name} : Find table by name
     * Find tables by name
     *
     * @param name name value that need to be considered for filter (required)
     * @return Respuesta tableCreate (status code 200)
     *         or En caso de que no se envien los datos necesarios para realizar la operación o los mismos tengan un formato erroneo (status code 400)
     *         or En caso de error general en el servidor (status code 500)
     */
    @ApiOperation(value = "Find table by name", nickname = "findTablesByName", notes = "Find tables by name", response = TableCreateRDTO.class, responseContainer = "List", authorizations = {
        
        @Authorization(value = "x-jwt-assertion")
         }, tags={ "table", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Respuesta tableCreate", response = TableCreateRDTO.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "En caso de que no se envien los datos necesarios para realizar la operación o los mismos tengan un formato erroneo", response = ErrorResponseRDTO.class),
        @ApiResponse(code = 500, message = "En caso de error general en el servidor", response = ErrorResponseRDTO.class) })
    @GetMapping(
        value = "/tables/byName/{name}",
        produces = { "application/json" }
    )
    default ResponseEntity<List<TableCreateRDTO>> findTablesByName(@ApiParam(value = "name value that need to be considered for filter",required=true) @PathVariable("name") String name) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"originalName\" : \"originalName\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\", \"waiter\" : \"waiter\", \"place\" : \"place\", \"state\" : \"POR_COGER_COMANDA\", \"free\" : true, \"products\" : [ { \"amount\" : \"\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\", \"place\" : \"place\", \"state\" : \"POR_PEDIR\" }, { \"amount\" : \"\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\", \"place\" : \"place\", \"state\" : \"POR_PEDIR\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /tables/byName/{name} : Delete table by name
     *
     * @param name Table name to delete (required)
     * @return En caso de que no se envien los datos necesarios para realizar la operación o los mismos tengan un formato erroneo (status code 400)
     *         or En caso de error general en el servidor (status code 500)
     */
    @ApiOperation(value = "Delete table by name", nickname = "tablesByNameNameDelete", notes = "", authorizations = {
        
        @Authorization(value = "x-jwt-assertion")
         }, tags={ "table", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "En caso de que no se envien los datos necesarios para realizar la operación o los mismos tengan un formato erroneo", response = ErrorResponseRDTO.class),
        @ApiResponse(code = 500, message = "En caso de error general en el servidor", response = ErrorResponseRDTO.class) })
    @DeleteMapping(
        value = "/tables/byName/{name}",
        produces = { "application/json" }
    )
    default ResponseEntity<Void> tablesByNameNameDelete(@ApiParam(value = "Table name to delete",required=true) @PathVariable("name") String name) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /tables/byId/{id} : Update or create an existing table
     *
     * @param id id (required)
     * @param body Table object that needs to be update (required)
     * @return Tableo completo con todas propiedades (status code 200)
     *         or En caso de que no se envien los datos necesarios para realizar la operación o los mismos tengan un formato erroneo (status code 400)
     *         or En caso de error general en el servidor (status code 500)
     */
    @ApiOperation(value = "Update or create an existing table", nickname = "updateTable", notes = "", response = TableCreateRDTO.class, authorizations = {
        
        @Authorization(value = "x-jwt-assertion")
         }, tags={ "table", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Tableo completo con todas propiedades", response = TableCreateRDTO.class),
        @ApiResponse(code = 400, message = "En caso de que no se envien los datos necesarios para realizar la operación o los mismos tengan un formato erroneo", response = ErrorResponseRDTO.class),
        @ApiResponse(code = 500, message = "En caso de error general en el servidor", response = ErrorResponseRDTO.class) })
    @PutMapping(
        value = "/tables/byId/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<TableCreateRDTO> updateTable(@ApiParam(value = "id",required=true) @PathVariable("id") String id,@ApiParam(value = "Table object that needs to be update" ,required=true )  @Valid @RequestBody TableCreateRDTO body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"originalName\" : \"originalName\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\", \"waiter\" : \"waiter\", \"place\" : \"place\", \"state\" : \"POR_COGER_COMANDA\", \"free\" : true, \"products\" : [ { \"amount\" : \"\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\", \"place\" : \"place\", \"state\" : \"POR_PEDIR\" }, { \"amount\" : \"\", \"price\" : \"\", \"name\" : \"name\", \"id\" : \"id\", \"place\" : \"place\", \"state\" : \"POR_PEDIR\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}