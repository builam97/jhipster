package com.mycompany.myapp.web.rest;

import java.time.Instant;
import java.util.List;

import com.mycompany.myapp.service.ResultService;
import com.mycompany.myapp.service.dto.ResultDTO;

import org.slf4j.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.annotation.Timed;

@RestController
@RequestMapping("/api")
public class ResultResource {
    private Logger log = LoggerFactory.getLogger(ResultResource.class);
    private final ResultService resultService;

    public ResultResource(ResultService resultService) {
        this.resultService = resultService;
    }

    @GetMapping("/getResult")
    @Timed
    public ResponseEntity<List<ResultDTO>> getResult(Long region, String date) {
        List<ResultDTO> result = resultService.findByRegionAndDate(region, date);
        return ResponseEntity.ok(result);
    }
}