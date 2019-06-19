package com.mycompany.myapp.domain;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// @Entity
// @Table(name="history_play")
public class HistoryPlay implements Serializable{
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "regionguess")
    private int regionguess;
    
    @Column(name = "userId")
	private Long userId;
	
	@OneToMany
	@JsonIgnoreProperties("")
	private Guess guess;
	
	@OneToMany
	@JsonIgnoreProperties("")
    private User user;
    
	public int getRegionguess() {
		return regionguess;
	}
	public void setRegionguess(int regionguess) {
		this.regionguess = regionguess;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Guess getGuess() {
		return guess;
	}
	public void setGuess(Guess guess) {
		this.guess = guess;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	
}