package com.egrikulas.googleplacesapi.geometry.location;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LocationRequest {

    @JsonProperty("lat")
    private double lat;
    @JsonProperty("lng")
    private double lng;
}
