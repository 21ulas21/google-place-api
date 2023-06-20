package com.egrikulas.googleplacesapi.photo.totalphotos;

import com.egrikulas.googleplacesapi.library.entity.AbstractEntity;
import com.egrikulas.googleplacesapi.photo.impl.Photo;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
@Table(name = TotalPhotos.TABLE)
public class TotalPhotos extends AbstractEntity {

    public static final String TABLE="total_photos";
    @OneToMany()
    private List<Photo> photosList;
}
