package com.egrikulas.googleplacesapi.photo.totalphotos;


import com.egrikulas.googleplacesapi.photo.impl.Photo;
import com.egrikulas.googleplacesapi.photo.impl.PhotoRequest;
import com.egrikulas.googleplacesapi.photo.impl.PhotoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
@AllArgsConstructor
public class TotalPhotosService {

    private final TotalPhotosRepository repository;
    private final PhotoService service;


    public TotalPhotos createTotalPhotos(List<PhotoRequest> request){
        TotalPhotos totalPhotos = new TotalPhotos();
        if (request != null) {
            List<Photo> photos = request.stream().map(service::creatPhoto).toList();
            totalPhotos.setPhotosList(photos);
        }
        return repository.save(totalPhotos);
    }



}
