package com.egrikulas.googleplacesapi.main.api;


import com.egrikulas.googleplacesapi.main.impl.MainEntity;
import com.egrikulas.googleplacesapi.main.impl.MainResponse;

import java.util.List;

public interface MainService {

    List<MainResponse> getOrganisationByMyLocation(double latitude, double longitude, int radius);

}
