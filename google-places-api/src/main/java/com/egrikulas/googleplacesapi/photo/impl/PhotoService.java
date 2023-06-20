package com.egrikulas.googleplacesapi.photo.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PhotoService {


    private final PhotoRepository repository;

    public Photo creatPhoto(PhotoRequest request){
        Photo photo = new Photo();
        photo.setPhotoReference(request.getPhotoReference());
        photo.setHeight(request.getHeight());
        photo.setWidth(request.getWidth());
        photo.setHtmlAttribution(request.getHtmlAttribution());
       return repository.save(photo);
    }

}
