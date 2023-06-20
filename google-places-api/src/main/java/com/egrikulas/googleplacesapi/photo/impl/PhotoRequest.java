package com.egrikulas.googleplacesapi.photo.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
public class PhotoRequest {
    @JsonProperty("height")
    private int height;
    @JsonProperty("html_attributions")
    private List<String> htmlAttribution;
    @JsonProperty("photo_reference")
    private String photoReference;
    @JsonProperty("width")
    private int width;
}
