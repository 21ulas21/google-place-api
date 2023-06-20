package com.egrikulas.googleplacesapi.geometry.impl;

import com.egrikulas.googleplacesapi.geometry.location.LocationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GeometryService {


    private final GeometryRepository repository;
    private final LocationService service;


    public Geometry createGeometry(GeometryRequest request){
        Geometry geometry = new Geometry();

        geometry.setLocation(service.createLocation(request.getLocation()));
        return repository.save(geometry);
    }



}
