package com.mycompany.myapp.service.mapper;

import org.mapstruct.*;

import com.mycompany.myapp.domain.HistoryPlay;
import com.mycompany.myapp.service.dto.HistoryPlayDTO;

@Mapper(componentModel= "spring", uses = {UserMapper.class,GuessMapper.class})
public interface HistoryPlayMapper extends EntityMapper<HistoryPlayDTO, HistoryPlay>{
	 @Mapping(source = "guess.id", target = "guessId")
	 @Mapping(source = "guess", target = "guess")
	 @Mapping(source = "user.id", target = "userId")
	 @Mapping(source = "user", target = "user")
	HistoryPlayDTO toDto(HistoryPlay historyPlay);
	
	 @Mapping(source = "userId", target = "user.id")
	 @Mapping(source = "guessId", target = "guess.id")
	HistoryPlay toEntity(HistoryPlayDTO historyPlayDTO);
}
