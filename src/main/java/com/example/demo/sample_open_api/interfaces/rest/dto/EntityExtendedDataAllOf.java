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
* EntityExtendedDataAllOf
*/
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-15T09:22:52.266046700-03:00[America/Buenos_Aires]")
public class EntityExtendedDataAllOf extends RepresentationModel<EntityExtendedDataAllOf>   {


    @JsonProperty("test")
      private String test;


    public EntityExtendedDataAllOf test(String test) {
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
  EntityExtendedDataAllOf entityExtendedDataAllOf = (EntityExtendedDataAllOf) o;
  return Objects.equals(this.test, entityExtendedDataAllOf.test);
}

@Override
public int hashCode() {
return Objects.hash(test);
}

@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class EntityExtendedDataAllOf {\n");

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
