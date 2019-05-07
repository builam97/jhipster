package com.mycompany.myapp.service.impl;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.mycompany.myapp.domain.Result;
import com.mycompany.myapp.repository.ResultRepository;
import com.mycompany.myapp.service.ResultService;
import com.mycompany.myapp.service.dto.ResultDTO;
import com.mycompany.myapp.service.dto.ResultUpdateDTO;
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
        ResultDTO rs = resultMapper.toDto(resultRepository.save(resultMapper.toEntity(resultDTO)));
        return rs;
    }

    @Override
    public Optional<ResultDTO> findOne(Long id) {
        return null;
    }

    @Override
    public List<ResultDTO> findAll() {
        return null;
    }

    @Override
    public ResultUpdateDTO findByRegionAndDate(Long regional, String date) {
        ResultUpdateDTO resultDTO = new ResultUpdateDTO();
        List<Result> listResult = resultRepository.findByRegionAndDate(regional, date);
        List<String> listSpecial = new ArrayList<String>();
        List<String> listFirst = new ArrayList<String>();
        List<String> listSecond = new ArrayList<String>();
        List<String> listThird = new ArrayList<String>();
        List<String> listFourth = new ArrayList<String>();
        List<String> listFifth = new ArrayList<String>();
        List<String> listSixth = new ArrayList<String>();
        List<String> listSeventh = new ArrayList<String>();
        listResult.forEach(rs -> {
            if(rs.getFirst() != "" && rs.getFirst() != null) {
                listFirst.add(rs.getFirst());
            }
            if(rs.getSpecial() != "" && rs.getSpecial() != null) {
                listSpecial.add(rs.getSpecial());
            }
            if(rs.getSecond() != "" && rs.getSecond() != null) {
                listSecond.add(rs.getSecond());
            }
            if(rs.getThird() != "" && rs.getThird() != null) {
            	listThird.add(rs.getThird());
            }
            if(rs.getFourth() != "" && rs.getFourth() != null) {
            	listFourth.add(rs.getFourth());
            }
            if(rs.getFifth() != "" && rs.getFifth() != null) {
            	listFifth.add(rs.getFifth());
            }
            if(rs.getSixth() != "" && rs.getSixth() != null) {
            	listSixth.add(rs.getSixth());
            }
            if(rs.getSeventh() != "" && rs.getSeventh() != null) {
            	listSeventh.add(rs.getSeventh());
            }
        });
        resultDTO.setSpecial(listSpecial);
        resultDTO.setFirst(listFirst);
        resultDTO.setSecond(listSecond);
        resultDTO.setThird(listThird);
        resultDTO.setFourth(listFourth);
        resultDTO.setFifth(listFifth);
        resultDTO.setSixth(listSixth);
        resultDTO.setSeventh(listSeventh);
         return resultDTO;
    }

}