package com.egrikulas.googleplacesapi.maindata.impl;

import com.egrikulas.googleplacesapi.geometry.impl.GeometryRequest;
import com.egrikulas.googleplacesapi.openhours.impl.OpenHourRequest;
import com.egrikulas.googleplacesapi.photo.impl.PhotoRequest;
import com.egrikulas.googleplacesapi.pluscode.impl.PlusCodeRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MainDataRequest {

    @JsonProperty("business_status")
    private String businessStatus;

    @JsonProperty("geometry")
    private GeometryRequest geometry;

    @JsonProperty("icon")
    private String icon;

    @JsonProperty("icon_mask_base_uri")
    private String iconMaskBaseUri;

    @JsonProperty("name")
    private String name;

    @JsonProperty("place_id")
    private String placeId;

    @JsonProperty("scope")
    private String scope;

    @JsonProperty("vicinity")
    private String vicinity;

    @JsonProperty("opening_hours")
    private OpenHourRequest hourRequest;

    @JsonProperty("plus_code")
    private PlusCodeRequest plusCodeRequest;

    private double rating;
    @JsonProperty("icon_background_color")
    private String iconBackGroundColor;

    @JsonProperty("photos")
    private List<PhotoRequest> photoRequests;

    @JsonProperty("types")
    private List<String> types;
    @JsonProperty("reference")
    private String reference;
    @JsonProperty("user_ratings_total")
    private int userRating;






}
