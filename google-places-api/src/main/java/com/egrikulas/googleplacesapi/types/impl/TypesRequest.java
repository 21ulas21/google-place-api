package com.egrikulas.googleplacesapi.types.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class TypesRequest {
   @JsonProperty("types")
   private List<String> name;
}
