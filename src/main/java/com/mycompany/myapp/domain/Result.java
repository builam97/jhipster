package com.mycompany.myapp.domain;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import javax.persistence.*;

@Entity
@Table(name = "result")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Result implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first")
    private String first;

    @Column(name = "second")
    private String second;

    @Column(name = "third")
    private String third;

    @Column(name = "fourth")
    private String fourth;

    @Column(name = "fifth")
    private String fifth;

    @Column(name = "sixth")
    private String sixth;

    @Column(name = "seventh")
    private String seventh;

    @Column(name = "special")
    private String special;

    @Column(name = "create_date")
    private Instant create_date;

    @Column(name = "regional")
    private String regional;

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

	public String getRegional() {
		return regional;
	}

	public void setRegional(String regional) {
		this.regional = regional;
	}

	@Override
	public String toString() {
		return "Result [id=" + id + ", first=" + first + ", second=" + second + ", third=" + third + ", fourth="
				+ fourth + ", fifth=" + fifth + ", sixth=" + sixth + ", seventh=" + seventh + ", special=" + special
				+ ", create_date=" + create_date + ", regional=" + regional + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((create_date == null) ? 0 : create_date.hashCode());
		result = prime * result + ((fifth == null) ? 0 : fifth.hashCode());
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((fourth == null) ? 0 : fourth.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((regional == null) ? 0 : regional.hashCode());
		result = prime * result + ((second == null) ? 0 : second.hashCode());
		result = prime * result + ((seventh == null) ? 0 : seventh.hashCode());
		result = prime * result + ((sixth == null) ? 0 : sixth.hashCode());
		result = prime * result + ((special == null) ? 0 : special.hashCode());
		result = prime * result + ((third == null) ? 0 : third.hashCode());
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
		Result other = (Result) obj;
		if (create_date == null) {
			if (other.create_date != null)
				return false;
		} else if (!create_date.equals(other.create_date))
			return false;
		if (fifth == null) {
			if (other.fifth != null)
				return false;
		} else if (!fifth.equals(other.fifth))
			return false;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (fourth == null) {
			if (other.fourth != null)
				return false;
		} else if (!fourth.equals(other.fourth))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (regional == null) {
			if (other.regional != null)
				return false;
		} else if (!regional.equals(other.regional))
			return false;
		if (second == null) {
			if (other.second != null)
				return false;
		} else if (!second.equals(other.second))
			return false;
		if (seventh == null) {
			if (other.seventh != null)
				return false;
		} else if (!seventh.equals(other.seventh))
			return false;
		if (sixth == null) {
			if (other.sixth != null)
				return false;
		} else if (!sixth.equals(other.sixth))
			return false;
		if (special == null) {
			if (other.special != null)
				return false;
		} else if (!special.equals(other.special))
			return false;
		if (third == null) {
			if (other.third != null)
				return false;
		} else if (!third.equals(other.third))
			return false;
		return true;
	}



}
