package com.api_futbol.futbolistas_api.controllers;

import com.api_futbol.futbolistas_api.models.FutbolistaModel;
import com.api_futbol.futbolistas_api.services.FutbolistaService;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestParam;
/**
 *
 * @author WJHPa
 */
@RestController
@RequestMapping("/futbolista")
public class FutbolistaController {
    
    @Autowired
    private FutbolistaService futbolistaService;
    @GetMapping
    public Page<FutbolistaModel> getAllFutbolista(@RequestParam(defaultValue = "0") int page, 
                                                  @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return futbolistaService.getAllFutbolista(pageable);
    }
    
    @GetMapping(path = "/{id}")
    public Optional<FutbolistaModel> getByIdFutbolista(@PathVariable("id") Long id){
        return this.futbolistaService.getByIdFutbolista(id);
    }
    
    
}
