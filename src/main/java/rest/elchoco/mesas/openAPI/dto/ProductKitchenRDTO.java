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
 * ProductKitchenRDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-11T16:36:54.462410+02:00[Europe/Paris]")@lombok.Builder
									@lombok.NoArgsConstructor @lombok.AllArgsConstructor

public class ProductKitchenRDTO   {
  @JsonProperty("idTable")
  private String idTable;

  @JsonProperty("nameTable")
  private String nameTable;

  @JsonProperty("originalNameTable")
  private String originalNameTable;

  @JsonProperty("waiter")
  private String waiter;

  @JsonProperty("idProduct")
  private String idProduct;

  @JsonProperty("name")
  private String name;

  @JsonProperty("amount")
  private Double amount = null;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    BARRA("BARRA"),
    
    POR_PEDIR("POR_PEDIR"),
    
    PEDIDO_A_COCINA("PEDIDO_A_COCINA"),
    
    EN_MARCHA_COCINA("EN_MARCHA_COCINA"),
    
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

  public ProductKitchenRDTO idTable(String idTable) {
    this.idTable = idTable;
    return this;
  }

  /**
   * Get idTable
   * @return idTable
  */
  @ApiModelProperty(value = "")


  public String getIdTable() {
    return idTable;
  }

  public void setIdTable(String idTable) {
    this.idTable = idTable;
  }

  public ProductKitchenRDTO nameTable(String nameTable) {
    this.nameTable = nameTable;
    return this;
  }

  /**
   * Get nameTable
   * @return nameTable
  */
  @ApiModelProperty(value = "")


  public String getNameTable() {
    return nameTable;
  }

  public void setNameTable(String nameTable) {
    this.nameTable = nameTable;
  }

  public ProductKitchenRDTO originalNameTable(String originalNameTable) {
    this.originalNameTable = originalNameTable;
    return this;
  }

  /**
   * Get originalNameTable
   * @return originalNameTable
  */
  @ApiModelProperty(value = "")


  public String getOriginalNameTable() {
    return originalNameTable;
  }

  public void setOriginalNameTable(String originalNameTable) {
    this.originalNameTable = originalNameTable;
  }

  public ProductKitchenRDTO waiter(String waiter) {
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

  public ProductKitchenRDTO idProduct(String idProduct) {
    this.idProduct = idProduct;
    return this;
  }

  /**
   * Get idProduct
   * @return idProduct
  */
  @ApiModelProperty(value = "")


  public String getIdProduct() {
    return idProduct;
  }

  public void setIdProduct(String idProduct) {
    this.idProduct = idProduct;
  }

  public ProductKitchenRDTO name(String name) {
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

  public ProductKitchenRDTO amount(Double amount) {
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

  public ProductKitchenRDTO state(StateEnum state) {
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
    ProductKitchenRDTO productKitchen = (ProductKitchenRDTO) o;
    return Objects.equals(this.idTable, productKitchen.idTable) &&
        Objects.equals(this.nameTable, productKitchen.nameTable) &&
        Objects.equals(this.originalNameTable, productKitchen.originalNameTable) &&
        Objects.equals(this.waiter, productKitchen.waiter) &&
        Objects.equals(this.idProduct, productKitchen.idProduct) &&
        Objects.equals(this.name, productKitchen.name) &&
        Objects.equals(this.amount, productKitchen.amount) &&
        Objects.equals(this.state, productKitchen.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTable, nameTable, originalNameTable, waiter, idProduct, name, amount, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductKitchenRDTO {\n");
    
    sb.append("    idTable: ").append(toIndentedString(idTable)).append("\n");
    sb.append("    nameTable: ").append(toIndentedString(nameTable)).append("\n");
    sb.append("    originalNameTable: ").append(toIndentedString(originalNameTable)).append("\n");
    sb.append("    waiter: ").append(toIndentedString(waiter)).append("\n");
    sb.append("    idProduct: ").append(toIndentedString(idProduct)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

