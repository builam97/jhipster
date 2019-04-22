package com.mycompany.myapp.domain;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "guess")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Guess implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "time_guess")
	private String time_guess;
	
	@Column(name= "number_guess")
	private String number_guess;
	
	@Column(name= "region")
	private Long region;
	
	@Column(name= "type_guess")
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

	@Override
	public String toString() {
		return "Guess [id=" + id + ", time_guess=" + time_guess + ", number_guess=" + number_guess + ", region="
				+ region + ", type_guess=" + type_guess + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((number_guess == null) ? 0 : number_guess.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + ((time_guess == null) ? 0 : time_guess.hashCode());
		result = prime * result + ((type_guess == null) ? 0 : type_guess.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Guess other = (Guess) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (number_guess == null) {
			if (other.number_guess != null)
				return false;
		} else if (!number_guess.equals(other.number_guess))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (time_guess == null) {
			if (other.time_guess != null)
				return false;
		} else if (!time_guess.equals(other.time_guess))
			return false;
		if (type_guess == null) {
			if (other.type_guess != null)
				return false;
		} else if (!type_guess.equals(other.type_guess))
			return false;
		return true;
	}

}
