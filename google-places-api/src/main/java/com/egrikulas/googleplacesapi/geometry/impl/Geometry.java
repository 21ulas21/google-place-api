package com.egrikulas.googleplacesapi.geometry.impl;


import com.egrikulas.googleplacesapi.geometry.location.Location;
import com.egrikulas.googleplacesapi.library.entity.AbstractEntity;
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
public class Geometry extends AbstractEntity {

    @OneToOne
    private Location location;



}
