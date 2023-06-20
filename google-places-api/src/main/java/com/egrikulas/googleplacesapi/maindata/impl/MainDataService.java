package com.egrikulas.googleplacesapi.maindata.impl;

import com.egrikulas.googleplacesapi.geometry.impl.GeometryService;
import com.egrikulas.googleplacesapi.openhours.impl.OpenHoursService;
import com.egrikulas.googleplacesapi.photo.totalphotos.TotalPhotosService;
import com.egrikulas.googleplacesapi.pluscode.impl.PlusCodeService;
import com.egrikulas.googleplacesapi.types.impl.TypesService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MainDataService {

    private final MainDataRepository repository;
    private final GeometryService geometryService;
    private final OpenHoursService openHoursService;
    private final TotalPhotosService photosService;
    private final PlusCodeService plusCodeService;
    private final TypesService typesService;




    public MainData createMainData(MainDataRequest request){
        MainData mainData = new MainData();
        mainData.setGeometry(geometryService.createGeometry(request.getGeometry()));
        mainData.setOpenHours(openHoursService.createOpenHours(request.getHourRequest()));
        mainData.setTotalPhotos(photosService.createTotalPhotos(request.getPhotoRequests()));
        mainData.setPlusCode(plusCodeService.createPlusCode(request.getPlusCodeRequest()));
        mainData.setTypes(typesService.creatTypes(request.getTypes()));
        mainData.setVicinity(request.getVicinity());
        mainData.setBusinessStatus(request.getBusinessStatus());
        mainData.setIcon(request.getIcon());
        mainData.setIconBackgroundColor(request.getIconBackGroundColor());
        mainData.setIconMaskBaseUri(request.getIconMaskBaseUri());
        mainData.setName(request.getName());
        mainData.setPlaceId(request.getPlaceId());
        mainData.setRating(request.getRating());
        mainData.setReference(request.getReference());
        mainData.setScope(request.getScope());
        mainData.setUserRatings(request.getUserRating());

        return repository.save(mainData);


    }




}
