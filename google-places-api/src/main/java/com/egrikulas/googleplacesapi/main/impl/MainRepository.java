package com.egrikulas.googleplacesapi.main.impl;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MainRepository extends JpaRepository<MainEntity, String> {

    Optional<MainEntity> findMainEntityByLatitudeAndLongitudeAndRadius(double latitude, double longitude, int radius);

}
