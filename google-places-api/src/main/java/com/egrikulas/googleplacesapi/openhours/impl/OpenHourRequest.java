package com.egrikulas.googleplacesapi.openhours.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OpenHourRequest {

    @JsonProperty("open_now")
    private Boolean openNow;

}
