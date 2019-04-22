package com.mycompany.myapp.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.myapp.domain.Guess;
import com.mycompany.myapp.repository.GuessRepository;
import com.mycompany.myapp.service.GuessService;
import com.mycompany.myapp.service.dto.GuessDTO;
import com.mycompany.myapp.service.mapper.GuessMapper;

@Service
@Transactional
public class GuessServiceImpl implements GuessService{
	private final Logger log = LoggerFactory.getLogger(GuessServiceImpl.class);
	private GuessRepository guessRepository;

	@Autowired
	private GuessMapper guessMapper;
	
	public GuessServiceImpl(GuessRepository guessRepository) {
		this.guessRepository = guessRepository;
	}

	@Override
	public GuessDTO save(GuessDTO guessDTO) {
		// TODO Auto-generated method stub
		Guess guess = guessMapper.toEntity(guessDTO);
		guess = guessRepository.save(guess);
		return guessMapper.toDto(guess);
	}
}
