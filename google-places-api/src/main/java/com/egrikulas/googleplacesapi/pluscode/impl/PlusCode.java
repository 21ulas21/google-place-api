package com.egrikulas.googleplacesapi.pluscode.impl;

import com.egrikulas.googleplacesapi.library.entity.AbstractEntity;
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
public class PlusCode extends AbstractEntity {

    private String compoundCode;

    private String globalCode;
}
