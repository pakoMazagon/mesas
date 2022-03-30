package rest.elchoco.mesas.openAPI.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductRDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-30T13:23:45.743486700+02:00[Europe/Paris]")@lombok.Builder
									@lombok.NoArgsConstructor @lombok.AllArgsConstructor

public class ProductRDTO   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("price")
  private Double price = null;

  @JsonProperty("place")
  private String place;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    POR_PEDIR("POR_PEDIR"),
    
    ESPERANDO("ESPERANDO"),
    
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

  public ProductRDTO id(String id) {
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

  public ProductRDTO name(String name) {
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

  public ProductRDTO amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @ApiModelProperty(value = "")


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public ProductRDTO price(Double price) {
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

  public ProductRDTO place(String place) {
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

  public ProductRDTO state(StateEnum state) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductRDTO product = (ProductRDTO) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.amount, product.amount) &&
        Objects.equals(this.price, product.price) &&
        Objects.equals(this.place, product.place) &&
        Objects.equals(this.state, product.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, amount, price, place, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductRDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

