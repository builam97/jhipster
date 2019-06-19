package com.mycompany.myapp.service.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class UserExtraDTO {
	private Long id;
	
	private String pointCash;
	
    @Size(max = 50)
    private String firstName;

    @Size(max = 50)
    private String lastName;

    @Email
    @Size(min = 5, max = 254)
    private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPointCash() {
		return pointCash;
	}

	public void setPointCash(String pointCash) {
		this.pointCash = pointCash;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
    
}
