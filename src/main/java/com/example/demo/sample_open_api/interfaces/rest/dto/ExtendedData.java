package com.example.demo.sample_open_api.interfaces.rest.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.hateoas.RepresentationModel;

/**
* ExtendedData
*/
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-15T09:22:52.266046700-03:00[America/Buenos_Aires]")
public class ExtendedData extends RepresentationModel<ExtendedData>   {


    @JsonProperty("data")
      private String data;


    public ExtendedData data(String data) {
      this.data = data;
    return this;
    }

  /**
    * Get data
  * @return data
  */
  @ApiModelProperty(value = "")
  

  public String getData() {
  return data;
  }

    public void setData(String data) {
    this.data = data;
    }



@Override
public boolean equals(Object o) {
if (this == o) {
return true;
}
if (o == null || getClass() != o.getClass()) {
return false;
}
  ExtendedData extendedData = (ExtendedData) o;
  return Objects.equals(this.data, extendedData.data);
}

@Override
public int hashCode() {
return Objects.hash(data);
}

@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class ExtendedData {\n");

sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
