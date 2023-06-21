package com.egrikulas.googleplacesapi.main.impl;

import com.egrikulas.googleplacesapi.main.api.MainService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/organisations")
@AllArgsConstructor
public class MainController {
    private final MainService service;







    @GetMapping("/my-location")
    public List<MainResponse> getLoc(@RequestParam double lat, @RequestParam double lng, @RequestParam int radius) {

        return service.getOrganisationByMyLocation(lat, lng, radius);
    }



}
