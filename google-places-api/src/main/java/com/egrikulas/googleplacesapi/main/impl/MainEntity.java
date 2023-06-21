package com.egrikulas.googleplacesapi.main.impl;


import com.egrikulas.googleplacesapi.library.entity.AbstractEntity;
import com.egrikulas.googleplacesapi.maindata.impl.MainData;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class MainEntity extends AbstractEntity {

    private double latitude;

    private double longitude;

    private int radius;

    @OneToMany
    private List<MainData> mainData;

}
