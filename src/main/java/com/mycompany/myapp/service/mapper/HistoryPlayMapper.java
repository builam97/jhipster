package com.mycompany.myapp.service.mapper;

import org.mapstruct.*;

import com.mycompany.myapp.domain.HistoryPlay;
import com.mycompany.myapp.service.dto.HistoryPlayDTO;

@Mapper(componentModel= "spring", uses = {})
public interface HistoryPlayMapper extends EntityMapper<HistoryPlayDTO, HistoryPlay>{
	// @Mapping(source = "guess.id", target = "guessId")
	// @Mapping(source = "guess", target = "guess")
	// @Mapping(source = "user.id", target = "userId")
	// @Mapping(source = "user", target = "user")
	HistoryPlayDTO toDto(HistoryPlay historyPlay);
	
	// @Mapping(source = "userId", target = "user")
	// @Mapping(source = "guessId", target = "guess")
	HistoryPlay toEntity(HistoryPlayDTO historyPlayDTO);
}
