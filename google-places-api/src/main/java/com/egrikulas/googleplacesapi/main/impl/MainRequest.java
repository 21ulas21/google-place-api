package com.egrikulas.googleplacesapi.main.impl;

import com.egrikulas.googleplacesapi.maindata.impl.MainDataRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MainRequest {

    @JsonProperty("results")
    List<MainDataRequest> mainDataRequest;

    @JsonProperty("next_page_token")
    String pageToken;

}
