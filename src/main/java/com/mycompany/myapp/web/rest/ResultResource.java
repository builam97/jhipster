package com.mycompany.myapp.web.rest;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

import com.mycompany.myapp.service.ResultService;
import com.mycompany.myapp.service.dto.ResultDTO;

import org.slf4j.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<ResultDTO> getResult(Long region, String date) {
        log.debug("result date"+ date);
        ResultDTO result = resultService.findByRegionAndDate(region, date);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/createResult")
    @Timed
    public ResponseEntity<ResultDTO> createResult(@RequestBody ResultDTO result) {
        return null;
    }

    @PutMapping("/updateResult")
    @Timed
    public ResponseEntity<ResultDTO> updateResult(@RequestBody ResultDTO result) {
        return null;
    }
}