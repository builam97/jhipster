package com.mycompany.myapp.domain;

import java.io.Serializable;

import javax.persistence.*;

public class HistoryPlay implements Serializable{
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "regionguess")
    private int regionguess;
    
    @Column(name = "userId")
	private Long userId;
	
	@Column(name = "guessId")
    private Long guessId;
    
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

	public Long getGuessId() {
		return guessId;
	}
	public void setGuessId(Long guessId) {
		this.guessId = guessId;
	}
	
}