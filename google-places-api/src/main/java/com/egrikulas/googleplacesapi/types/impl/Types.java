package com.egrikulas.googleplacesapi.types.impl;

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
public class Types extends AbstractEntity {

    @ElementCollection
    private List<String> name;

}
