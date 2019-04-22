package com.mycompany.myapp.service.dto;


public class HistoryPlayDTO {
	private Long id;
	private int regionguess;
	private Long userId;
	private UserDTO user;
	private Long guessId;
	private GuessDTO guess;
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
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
	}
	public Long getGuessId() {
		return guessId;
	}
	public void setGuessId(Long guessId) {
		this.guessId = guessId;
	}
	public GuessDTO getGuess() {
		return guess;
	}
	public void setGuess(GuessDTO guess) {
		this.guess = guess;
	}
	
	
}
