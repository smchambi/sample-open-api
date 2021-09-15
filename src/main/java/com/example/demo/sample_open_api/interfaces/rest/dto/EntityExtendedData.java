package com.example.demo.sample_open_api.interfaces.rest.dto;

import java.util.Objects;
import com.example.demo.sample_open_api.interfaces.rest.dto.EntityExtendedDataAllOf;
import com.example.demo.sample_open_api.interfaces.rest.dto.ExtendedData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.hateoas.RepresentationModel;

/**
* EntityExtendedData
*/
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-15T09:22:52.266046700-03:00[America/Buenos_Aires]")
public class EntityExtendedData extends RepresentationModel<EntityExtendedData>   {

    private static final String SUBJECT = "iop.extensibility.libdatax.entity.v1";

    @JsonProperty("data")
      private String data;


    @JsonProperty("test")
      private String test;


    public EntityExtendedData data(String data) {
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



    public EntityExtendedData test(String test) {
      this.test = test;
    return this;
    }

  /**
    * Get test
  * @return test
  */
  @ApiModelProperty(value = "")
  

  public String getTest() {
  return test;
  }

    public void setTest(String test) {
    this.test = test;
    }



@Override
public boolean equals(Object o) {
if (this == o) {
return true;
}
if (o == null || getClass() != o.getClass()) {
return false;
}
  EntityExtendedData entityExtendedData = (EntityExtendedData) o;
  return Objects.equals(this.data, entityExtendedData.data) &&
  Objects.equals(this.test, entityExtendedData.test);
}

@Override
public int hashCode() {
return Objects.hash(data, test);
}

@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class EntityExtendedData {\n");

sb.append("    data: ").append(toIndentedString(data)).append("\n");
sb.append("    test: ").append(toIndentedString(test)).append("\n");
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
