package com.mycompany.myapp.domain;

import java.io.Serializable;

import javax.persistence.*;

public class Guess implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "time_guess")
	private String time_guess;
	
	@Column(name= "number_guess")
	private String number_guess;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTime_guess() {
		return time_guess;
	}

	public void setTime_guess(String time_guess) {
		this.time_guess = time_guess;
	}

	public String getNumber_guess() {
		return number_guess;
	}

	public void setNumber_guess(String number_guess) {
		this.number_guess = number_guess;
	}
	
	

}
