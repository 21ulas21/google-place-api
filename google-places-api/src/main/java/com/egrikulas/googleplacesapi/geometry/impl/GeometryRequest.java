package com.egrikulas.googleplacesapi.geometry.impl;

import com.egrikulas.googleplacesapi.geometry.location.LocationRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GeometryRequest {

    @JsonProperty("location")
    private LocationRequest location;
}
