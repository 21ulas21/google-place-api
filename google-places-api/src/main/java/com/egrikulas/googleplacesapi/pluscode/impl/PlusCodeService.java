package com.egrikulas.googleplacesapi.pluscode.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlusCodeService {

    private final PlusCodeRepository repository;

    public PlusCode createPlusCode(PlusCodeRequest request){

        PlusCode plusCode = new PlusCode();
        if (request == null){
            repository.save(plusCode);
            return plusCode;
        }
        plusCode.setCompoundCode(request.getCompoundCode());
        plusCode.setGlobalCode(request.getGlobalCode());
        return repository.save(plusCode);
    }


}
