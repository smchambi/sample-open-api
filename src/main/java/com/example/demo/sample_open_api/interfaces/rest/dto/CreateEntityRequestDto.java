package com.example.demo.sample_open_api.interfaces.rest.dto;

import java.util.Objects;
import com.example.demo.sample_open_api.interfaces.rest.dto.ExtendedData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.hateoas.RepresentationModel;

/**
* CreateEntityRequestDto
*/
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-15T14:11:08.519201400+02:00[Europe/Paris]")
public class CreateEntityRequestDto extends RepresentationModel<CreateEntityRequestDto>   {


    @JsonProperty("extended_data")
      private ExtendedData extendedData;


    @JsonProperty("very_important_number")
      private BigDecimal veryImportantNumber;


    public CreateEntityRequestDto extendedData(ExtendedData extendedData) {
      this.extendedData = extendedData;
    return this;
    }

  /**
    * iop.extensibility.description
  * @return extendedData
  */
  @ApiModelProperty(value = "iop.extensibility.description")
  
  @Valid

  public ExtendedData getExtendedData() {
  return extendedData;
  }

    public void setExtendedData(ExtendedData extendedData) {
    this.extendedData = extendedData;
    }



    public CreateEntityRequestDto veryImportantNumber(BigDecimal veryImportantNumber) {
      this.veryImportantNumber = veryImportantNumber;
    return this;
    }

  /**
    * A very important number, of course
    * minimum: 0
    * maximum: 42
  * @return veryImportantNumber
  */
  @ApiModelProperty(value = "A very important number, of course")
  
  @Valid
@DecimalMin("0") @DecimalMax("42") 
  public BigDecimal getVeryImportantNumber() {
  return veryImportantNumber;
  }

    public void setVeryImportantNumber(BigDecimal veryImportantNumber) {
    this.veryImportantNumber = veryImportantNumber;
    }



@Override
public boolean equals(Object o) {
if (this == o) {
return true;
}
if (o == null || getClass() != o.getClass()) {
return false;
}
  CreateEntityRequestDto createEntityRequestDto = (CreateEntityRequestDto) o;
  return Objects.equals(this.extendedData, createEntityRequestDto.extendedData) &&
  Objects.equals(this.veryImportantNumber, createEntityRequestDto.veryImportantNumber);
}

@Override
public int hashCode() {
return Objects.hash(extendedData, veryImportantNumber);
}

@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class CreateEntityRequestDto {\n");

sb.append("    extendedData: ").append(toIndentedString(extendedData)).append("\n");
sb.append("    veryImportantNumber: ").append(toIndentedString(veryImportantNumber)).append("\n");
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
