package com.mycompany.myapp.service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

import com.mycompany.myapp.service.dto.ResultDTO;

public interface ResultService {
    ResultDTO save(ResultDTO resultDTO);
    
    Optional<ResultDTO> findOne(Long id);

    List<ResultDTO> findAll();

    List<ResultDTO> findByRegionAndDate(Long regional, String date);
}