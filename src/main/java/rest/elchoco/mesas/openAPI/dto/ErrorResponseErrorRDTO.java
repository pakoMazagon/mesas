package rest.elchoco.mesas.openAPI.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Payload estandard
 */
@ApiModel(description = "Payload estandard")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-11T16:36:54.462410+02:00[Europe/Paris]")@lombok.Builder
									@lombok.NoArgsConstructor @lombok.AllArgsConstructor

public class ErrorResponseErrorRDTO   {
  @JsonProperty("message")
  private String message;

  @JsonProperty("request_id")
  private String requestId;

  @JsonProperty("details")
  private String details;

  @JsonProperty("code")
  private Integer code;

  public ErrorResponseErrorRDTO message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Describe la causa del error.
   * @return message
  */
  @ApiModelProperty(required = true, value = "Describe la causa del error.")
  @NotNull


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorResponseErrorRDTO requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Describe un código de petición único.
   * @return requestId
  */
  @ApiModelProperty(required = true, value = "Describe un código de petición único.")
  @NotNull


  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public ErrorResponseErrorRDTO details(String details) {
    this.details = details;
    return this;
  }

  /**
   * Contiene un objeto con el detalle adicional de errores que desee aportar cada table owner del aplicativo
   * @return details
  */
  @ApiModelProperty(value = "Contiene un objeto con el detalle adicional de errores que desee aportar cada table owner del aplicativo")


  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public ErrorResponseErrorRDTO code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Respuesta proporcionada por las aplicaciones en caso de error.
   * @return code
  */
  @ApiModelProperty(value = "Respuesta proporcionada por las aplicaciones en caso de error.")


  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponseErrorRDTO errorResponseError = (ErrorResponseErrorRDTO) o;
    return Objects.equals(this.message, errorResponseError.message) &&
        Objects.equals(this.requestId, errorResponseError.requestId) &&
        Objects.equals(this.details, errorResponseError.details) &&
        Objects.equals(this.code, errorResponseError.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, requestId, details, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponseErrorRDTO {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

