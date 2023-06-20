package com.egrikulas.googleplacesapi.photo.impl;

import com.egrikulas.googleplacesapi.library.entity.AbstractEntity;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Photo extends AbstractEntity {

    private int height;

    @ElementCollection
    private List<String> htmlAttribution;

    private String photoReference;

    private int width;

}
