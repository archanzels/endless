package com.suman.endless.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "request")
public class Request {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "request_id")
	public Integer id;

	@Column(name = "first_name")
	@NotEmpty
	public String firstName;

	@Column(name = "last_name")
	@NotEmpty
	public String lastName;

	@Column(name = "bgroup")
	@NotEmpty
	public String group;

	@Column(name = "address")
	@NotEmpty
	public String address;

	@Temporal(TemporalType.DATE)
	private Date postedDate;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@FutureOrPresent
	private Date requiredDate;

	public Request() {
	}

	public Request(String firstName, String lastName, String group, String address, Date postedDate,
			Date requiredDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.group = group;
		this.address = address;
		this.postedDate = postedDate;
		this.requiredDate = requiredDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getPostedDate() {
		return postedDate;
	}

	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}

	public Date getRequiredDate() {
		return requiredDate;
	}

	public void setRequiredDate(Date requiredDate) {
		this.requiredDate = requiredDate;
	}
}
