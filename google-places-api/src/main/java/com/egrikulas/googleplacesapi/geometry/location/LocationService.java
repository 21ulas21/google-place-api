package com.egrikulas.googleplacesapi.geometry.location;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LocationService {


    private final LocationRepository repository;

    public Location createLocation(LocationRequest request){
        Location location = new Location();
        location.setLat(request.getLat());
        location.setLng(request.getLng());
        return repository.save(location);
    }


}
