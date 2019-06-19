package com.mycompany.myapp.web.rest;

import com.mycompany.myapp.service.ResultService;
import com.mycompany.myapp.service.dto.NotificationRequestDTO;
import com.mycompany.myapp.service.dto.ResultDTO;
import com.mycompany.myapp.service.dto.ResultUpdateDTO;

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
    public ResponseEntity<ResultUpdateDTO> getResult(Long region, String date) {
        log.debug("result date"+ date);
        ResultUpdateDTO result = resultService.findByRegionAndDate(region, date);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/createResult")
    @Timed
    public ResponseEntity<ResultDTO> createResult(@RequestBody ResultDTO result) {
        ResultDTO rs = resultService.save(result);
        return ResponseEntity.ok(rs);
    }

    @PutMapping("/updateResult")
    @Timed
    public ResponseEntity<ResultDTO> updateResult(@RequestBody ResultDTO result) {
        return null;
    }

    // @GetMapping("/getResultCentral")
    // @Timed
    // public ResponseEntity<List<ResultUpdateDTO>> getResultCentral(Long region, String date) {

    // }
    @PostMapping("/push-notification")
    @Timed
    public ResponseEntity<String> pushNotification(@RequestBody ResultDTO result) {
    	String status = resultService.pushNotification(result);
    	return ResponseEntity.ok(status);
    }
}