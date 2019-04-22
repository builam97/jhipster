package com.mycompany.myapp.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.mycompany.myapp.repository.GuessRepository;
import com.mycompany.myapp.service.GuessService;
import com.mycompany.myapp.service.dto.GuessDTO;
import com.mycompany.myapp.service.mapper.GuessMapper;

import io.micrometer.core.annotation.Timed;

@RestController
@RequestMapping("/api")
public class GuessResource {
	private Logger log = LoggerFactory.getLogger(GuessResource.class);

	private GuessService guessService;
	private GuessRepository guessRepository;
	@Autowired
	private GuessMapper guessMapper;
	public GuessResource(GuessService guessService, GuessRepository guessRepository) {
		this.guessService = guessService;
		this.guessRepository = guessRepository;
	}
	@PostMapping("/createGuess")
	@Timed
	public ResponseEntity<GuessDTO> createGuess(@RequestBody GuessDTO guessDto){
		log.debug("guess post");
		GuessDTO result = guessService.save(guessDto);
		return ResponseEntity.ok(result);
	}

	@GetMapping("/getGuess")
	@Timed
	public ResponseEntity<List<GuessDTO>> getAllGuess() {
		log.debug("get guess all");
		List<GuessDTO> listGuess = guessMapper.toDto(guessRepository.findAll());
		return ResponseEntity.ok(listGuess);
	}
}
