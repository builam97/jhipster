package com.mycompany.myapp.service.mapper;

import org.mapstruct.Mapper;

import com.mycompany.myapp.domain.Guess;
import com.mycompany.myapp.service.dto.GuessDTO;

@Mapper(componentModel= "spring", uses = {})
public interface GuessMapper extends EntityMapper<GuessDTO, Guess>{
	GuessDTO toDto(Guess guess);

	Guess toEntity(GuessDTO guessDTO);
}
