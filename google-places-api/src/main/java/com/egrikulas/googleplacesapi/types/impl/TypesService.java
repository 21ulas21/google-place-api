package com.egrikulas.googleplacesapi.types.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TypesService {

    private final TypesRepository repository;

    public Types creatTypes(List<String> request){

      Types types = new Types();
      types.setName(request);
        return repository.save(types);
    }


}
