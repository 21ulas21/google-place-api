package com.egrikulas.googleplacesapi.maindata.impl;

import com.egrikulas.googleplacesapi.geometry.impl.Geometry;
import com.egrikulas.googleplacesapi.library.entity.AbstractEntity;
import com.egrikulas.googleplacesapi.openhours.impl.OpenHours;
import com.egrikulas.googleplacesapi.photo.totalphotos.TotalPhotos;
import com.egrikulas.googleplacesapi.pluscode.impl.PlusCode;
import com.egrikulas.googleplacesapi.types.impl.Types;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MainData extends AbstractEntity {


    private String businessStatus;

    @OneToOne
    private Geometry geometry;

    private String icon;

    private String iconBackgroundColor;

    private String iconMaskBaseUri;

    private String name;//
    @OneToOne
    private TotalPhotos totalPhotos;//
    @OneToOne
    private OpenHours openHours;//

    private String placeId;
    @OneToOne
    private PlusCode plusCode;

    private double rating;//

    private String reference;

    private String scope;
    @OneToOne
    private Types types;

    private int userRatings;//

    private String vicinity;//





}