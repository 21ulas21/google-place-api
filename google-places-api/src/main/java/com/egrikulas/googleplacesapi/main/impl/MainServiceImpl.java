package com.egrikulas.googleplacesapi.main.impl;

import com.egrikulas.googleplacesapi.main.api.MainService;
import com.egrikulas.googleplacesapi.maindata.impl.MainData;
import com.egrikulas.googleplacesapi.maindata.impl.MainDataService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.List;


@Service
@AllArgsConstructor
public class MainServiceImpl implements MainService {
   private final MainDataService mainDataService;
   private final MainRepository repository;



    public static final String BASE_URL = "https://maps.googleapis.com";
    public static final String PATH = "/maps/api/place/nearbysearch/json";
    //@Value
    public static final String API_KEY = "API-KEY";

    @Override
    public List<MainResponse> getOrganisationByMyLocation(double latitude, double longitude, int radius) {


        var main = repository.findMainEntityByLatitudeAndLongitudeAndRadius(latitude, longitude, radius)
                .orElseGet(() -> {
                    try {
                        return creatMainEntity(latitude, longitude, radius);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                });
        return main.getMainData().stream().map(this::toResponse).toList();
    }
    private MainEntity creatMainEntity(double latitude, double longitude, int radius) throws InterruptedException {
        MainRequest mainRequest =getOrganisation(latitude, longitude,radius);
        List<MainData> mainData = mainRequest.getMainDataRequest().stream().map(mainDataService::createMainData).toList();
        MainEntity main = new MainEntity();
        main.setMainData(mainData);
        main.setLatitude(latitude);
        main.setLongitude(longitude);
        main.setRadius(radius);

        return repository.save(main);
    }

    private MainRequest getOrganisation(double latitude, double longitude, int radius) throws InterruptedException {

        String pagetoken = null;
        String component = String.valueOf(latitude)+","+String.valueOf(longitude);
        String url = UriComponentsBuilder
                        .fromHttpUrl(BASE_URL)
                        .path(PATH)
                        .queryParam("location", component)
                        .queryParam("radius", radius)
                        .queryParam("key",API_KEY).toUriString();
       MainRequest mainRequest = webClientRequest(url);
       if(mainRequest.getPageToken() == null){
           return mainRequest;
       }
       pagetoken = mainRequest.getPageToken();
       do{
           Thread.sleep(3000);
          MainRequest request = nextPage(pagetoken);
          mainRequest.getMainDataRequest().addAll(request.getMainDataRequest());
          pagetoken = request.getPageToken();
       }while (pagetoken != null);

           return mainRequest;



    }
    private MainRequest nextPage(String token){
        String url = UriComponentsBuilder
                .fromHttpUrl(BASE_URL)
                .path(PATH)
                .queryParam("pagetoken",token)
                .queryParam("key", API_KEY).toUriString();
        return webClientRequest(url);

    }
    private MainRequest webClientRequest(String url){
       WebClient webClient = WebClient.create();
        Mono<MainRequest> mono = webClient.get().uri(url).retrieve().bodyToMono(MainRequest.class);
        return mono.share().block();


    }
    private MainResponse toResponse(MainData data){
       return MainResponse.builder()
               .name(data.getName())
               .openHours(data.getOpenHours())
               .rating(data.getRating())
               .totalPhotos(data.getTotalPhotos())
               .userRatings(data.getUserRatings())
               .vicinity(data.getVicinity())
               .build();


    }

}
