package com.mycompany.myapp.service.mapper;

import org.mapstruct.*;

import com.mycompany.myapp.domain.HistoryPlay;
import com.mycompany.myapp.service.dto.HistoryPlayDTO;

@Mapper(componentModel= "spring", uses = {})
public interface HistoryPlayMapper extends EntityMapper<HistoryPlayDTO, HistoryPlay>{
	@Mapping(source = "guessId", target = "guess.id")
	@Mapping(source = "userId", target = "user.id")
	HistoryPlayDTO toDto(HistoryPlay historyPlay);
	
	
	HistoryPlay toEntity(HistoryPlayDTO historyPlayDTO);
}
