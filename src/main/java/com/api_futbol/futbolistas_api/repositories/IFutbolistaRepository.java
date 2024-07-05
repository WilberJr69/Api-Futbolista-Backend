package com.api_futbol.futbolistas_api.repositories;

import com.api_futbol.futbolistas_api.models.FutbolistaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


@Repository
public interface IFutbolistaRepository extends JpaRepository<FutbolistaModel, Long>{
    
    Page<FutbolistaModel> findAll(Pageable pageable);
    
}
