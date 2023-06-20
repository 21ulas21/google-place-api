package com.egrikulas.googleplacesapi.geometry.location;


import com.egrikulas.googleplacesapi.library.entity.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = Location.TABLE)
public class Location extends AbstractEntity {

    public static final String TABLE="location";
    private static final String COL_LAT = "latitude";
    private static final String COL_LNG = "longitude";

    @Column(name = COL_LAT)
    private double lat;
    @Column(name = COL_LNG)
    private double lng;
}
