package com.mycompany.myapp.service.dto;

import java.time.Instant;
import java.util.Date;

public class ResultDTO {
    private Long id;

    private String first;

    private String second;

    private String third;

    private String fourth;

    private String fifth;

    private String sixth;

    private String seventh;

    private String special;

    private Instant create_date;
    
	private int regional;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getSecond() {
		return second;
	}

	public void setSecond(String second) {
		this.second = second;
	}

	public String getThird() {
		return third;
	}

	public void setThird(String third) {
		this.third = third;
	}

	public String getFourth() {
		return fourth;
	}

	public void setFourth(String fourth) {
		this.fourth = fourth;
	}

	public String getFifth() {
		return fifth;
	}

	public void setFifth(String fifth) {
		this.fifth = fifth;
	}

	public String getSixth() {
		return sixth;
	}

	public void setSixth(String sixth) {
		this.sixth = sixth;
	}

	public String getSeventh() {
		return seventh;
	}

	public void setSeventh(String seventh) {
		this.seventh = seventh;
	}

	public String getSpecial() {
		return special;
	}

	public void setSpecial(String special) {
		this.special = special;
	}

	public Instant getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Instant create_date) {
		this.create_date = create_date;
	}

	public int getRegional() {
		return regional;
	}

	public void setRegional(int regional) {
		this.regional = regional;
	}
	
	
}