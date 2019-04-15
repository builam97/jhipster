package com.mycompany.myapp.service.impl;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

import com.mycompany.myapp.repository.ResultRepository;
import com.mycompany.myapp.service.ResultService;
import com.mycompany.myapp.service.dto.ResultDTO;
import com.mycompany.myapp.service.mapper.ResultMapper;
import com.mycompany.myapp.service.util.MyUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ResultServiceImpl implements ResultService {
    private final Logger log = LoggerFactory.getLogger(ResultServiceImpl.class);
    private ResultRepository resultRepository;

    @Autowired
    private ResultMapper resultMapper;

    public ResultServiceImpl(ResultRepository result) {
        this.resultRepository = result;
    }

    @Override
    public ResultDTO save(ResultDTO resultDTO) {
        return null;
    }

    @Override
    public Optional<ResultDTO> findOne(Long id) {
        return null;
    }

    @Override
    public List<ResultDTO> findAll() {
        return resultMapper.toDto(resultRepository.findAll());
    }

    @Override
    public List<ResultDTO> findByRegionAndDate(Long regional, String date) {
        return resultMapper.toDto(resultRepository.findByRegionAndDate(regional, date));
    }

}