package com.egrikulas.googleplacesapi.openhours.impl;

import com.egrikulas.googleplacesapi.library.entity.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OpenHours extends AbstractEntity {

    public static final String TABLE="open_hours";
    public static final String COL_OPEN_NOW="open_now";
    @Column(name = COL_OPEN_NOW)
    private Boolean openNow;
}
