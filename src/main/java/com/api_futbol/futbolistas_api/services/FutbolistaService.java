package com.api_futbol.futbolistas_api.services;

import com.api_futbol.futbolistas_api.models.FutbolistaModel;
import com.api_futbol.futbolistas_api.repositories.IFutbolistaRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
public class FutbolistaService {
    
    @Autowired
    IFutbolistaRepository futbolistaRepository;
    
    public Page<FutbolistaModel> getAllFutbolista(Pageable pageable) {
        return futbolistaRepository.findAll(pageable);
    }
    
    public Optional<FutbolistaModel> getByIdFutbolista(Long id){
        return futbolistaRepository.findById(id);
    }
    
    
}
