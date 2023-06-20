package com.egrikulas.googleplacesapi.openhours.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OpenHoursService {
    private final OpenHoursRepository repository;

    public OpenHours createOpenHours(OpenHourRequest request){
        OpenHours openHours = new OpenHours();
        if (request == null){
            openHours.setOpenNow(null);
            return repository.save(openHours);
        }else {
            openHours.setOpenNow(request.getOpenNow());
            return repository.save(openHours);
        }

    }
}
