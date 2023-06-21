package com.egrikulas.googleplacesapi.main.impl;

import com.egrikulas.googleplacesapi.openhours.impl.OpenHours;
import com.egrikulas.googleplacesapi.photo.totalphotos.TotalPhotos;
import lombok.*;

@Data
@Builder
public class MainResponse {

    private String name;
    private TotalPhotos totalPhotos;
    private OpenHours openHours;
    private double rating;
    private int userRatings;
    private String vicinity;

}
