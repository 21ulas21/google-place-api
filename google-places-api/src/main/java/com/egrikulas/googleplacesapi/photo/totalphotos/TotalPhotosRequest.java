package com.egrikulas.googleplacesapi.photo.totalphotos;

import com.egrikulas.googleplacesapi.photo.impl.PhotoRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class TotalPhotosRequest {
   @JsonProperty("photos")
   private List<PhotoRequest> name;
}
