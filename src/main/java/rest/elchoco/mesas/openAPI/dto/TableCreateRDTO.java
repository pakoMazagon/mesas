package rest.elchoco.mesas.openAPI.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import rest.elchoco.mesas.openAPI.dto.ProductRDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TableCreateRDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-11T16:36:54.462410+02:00[Europe/Paris]")@lombok.Builder
									@lombok.NoArgsConstructor @lombok.AllArgsConstructor

public class TableCreateRDTO   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("originalName")
  private String originalName;

  @JsonProperty("waiter")
  private String waiter;

  @JsonProperty("price")
  private Double price = null;

  @JsonProperty("place")
  private String place;

  @JsonProperty("free")
  private Boolean free;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    POR_COGER_COMANDA("POR_COGER_COMANDA"),
    
    POR_PEDIR_COCINA("POR_PEDIR_COCINA"),
    
    ESPERANDO_COCINA("ESPERANDO_COCINA"),
    
    SERVIDO("SERVIDO");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("state")
  private StateEnum state;

  @JsonProperty("products")
  @Valid
  private List<ProductRDTO> products = null;

  public TableCreateRDTO id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TableCreateRDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TableCreateRDTO originalName(String originalName) {
    this.originalName = originalName;
    return this;
  }

  /**
   * Get originalName
   * @return originalName
  */
  @ApiModelProperty(value = "")


  public String getOriginalName() {
    return originalName;
  }

  public void setOriginalName(String originalName) {
    this.originalName = originalName;
  }

  public TableCreateRDTO waiter(String waiter) {
    this.waiter = waiter;
    return this;
  }

  /**
   * Get waiter
   * @return waiter
  */
  @ApiModelProperty(value = "")


  public String getWaiter() {
    return waiter;
  }

  public void setWaiter(String waiter) {
    this.waiter = waiter;
  }

  public TableCreateRDTO price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @ApiModelProperty(value = "")


  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public TableCreateRDTO place(String place) {
    this.place = place;
    return this;
  }

  /**
   * Get place
   * @return place
  */
  @ApiModelProperty(value = "")


  public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }

  public TableCreateRDTO free(Boolean free) {
    this.free = free;
    return this;
  }

  /**
   * Get free
   * @return free
  */
  @ApiModelProperty(value = "")


  public Boolean getFree() {
    return free;
  }

  public void setFree(Boolean free) {
    this.free = free;
  }

  public TableCreateRDTO state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @ApiModelProperty(value = "")


  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public TableCreateRDTO products(List<ProductRDTO> products) {
    this.products = products;
    return this;
  }

  public TableCreateRDTO addProductsItem(ProductRDTO productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

  /**
   * Get products
   * @return products
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ProductRDTO> getProducts() {
    return products;
  }

  public void setProducts(List<ProductRDTO> products) {
    this.products = products;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableCreateRDTO tableCreate = (TableCreateRDTO) o;
    return Objects.equals(this.id, tableCreate.id) &&
        Objects.equals(this.name, tableCreate.name) &&
        Objects.equals(this.originalName, tableCreate.originalName) &&
        Objects.equals(this.waiter, tableCreate.waiter) &&
        Objects.equals(this.price, tableCreate.price) &&
        Objects.equals(this.place, tableCreate.place) &&
        Objects.equals(this.free, tableCreate.free) &&
        Objects.equals(this.state, tableCreate.state) &&
        Objects.equals(this.products, tableCreate.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, originalName, waiter, price, place, free, state, products);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableCreateRDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originalName: ").append(toIndentedString(originalName)).append("\n");
    sb.append("    waiter: ").append(toIndentedString(waiter)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    free: ").append(toIndentedString(free)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

