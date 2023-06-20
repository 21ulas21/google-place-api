package com.egrikulas.googleplacesapi.pluscode.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PlusCodeRequest {

    @JsonProperty("compound_code")
    private String compoundCode;
    @JsonProperty("global_code")
    private String globalCode;
}
