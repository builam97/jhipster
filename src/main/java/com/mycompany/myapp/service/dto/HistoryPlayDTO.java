package com.mycompany.myapp.service.dto;

import com.mycompany.myapp.domain.Guess;
import com.mycompany.myapp.domain.User;

public class HistoryPlayDTO {
	private Long id;
	private int regionguess;
	private User user;
	private Guess guess;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getRegionguess() {
		return regionguess;
	}
	public void setRegionguess(int regionguess) {
		this.regionguess = regionguess;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public Guess getGuess() {
		return guess;
	}
	public void setGuess(Guess guess) {
		this.guess = guess;
	}
	
}
