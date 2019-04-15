package com.mycompany.myapp.service.mapper;

import org.mapstruct.Mapper;

import com.mycompany.myapp.domain.HistoryPlay;
import com.mycompany.myapp.service.dto.HistoryPlayDTO;

@Mapper(componentModel= "spring", uses = {})
public interface HistoryPlayMapper extends EntityMapper<HistoryPlayDTO, HistoryPlay>{
	HistoryPlayDTO toDto(HistoryPlay historyPlay);
	
	HistoryPlay toEntity(HistoryPlayDTO historyPlayDTO);
}
