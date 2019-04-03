package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.Result;
import com.mycompany.myapp.service.dto.ResultDTO;

import org.mapstruct.*;

@Mapper(componentModel = "spring", uses = {})
public interface ResultMapper extends EntityMapper<ResultDTO, Result> {
    ResultDTO toDto(Result result);

    Result toEntity(ResultDTO resultDTO);
}