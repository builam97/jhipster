package com.mycompany.myapp.service.dto;


public class GuessDTO {
	private Long id;
	
	private String time_guess;
	
	private String number_guess;
	
	private Long region;
	
	private Long type_guess;

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

	public Long getRegion() {
		return region;
	}

	public void setRegion(Long region) {
		this.region = region;
	}

	public Long getType_guess() {
		return type_guess;
	}

	public void setType_guess(Long type_guess) {
		this.type_guess = type_guess;
	}

}
