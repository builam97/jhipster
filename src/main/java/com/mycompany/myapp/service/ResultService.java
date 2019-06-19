package com.mycompany.myapp.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.configurationprocessor.json.JSONException;

import com.mycompany.myapp.service.dto.ResultDTO;
import com.mycompany.myapp.service.dto.ResultUpdateDTO;

public interface ResultService {
    ResultDTO save(ResultDTO resultDTO);
    
    Optional<ResultDTO> findOne(Long id);

    List<ResultDTO> findAll();

    ResultUpdateDTO findByRegionAndDate(Long regional, String date);
    
    String pushNotification(ResultDTO resultDTO);
}