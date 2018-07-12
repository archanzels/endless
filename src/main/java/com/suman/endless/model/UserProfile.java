package com.suman.endless.model;

import javax.persistence.*;

@Entity
@Table(name = "user_profiles")
public class UserProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Gender gender;

	@Column(name = "bgroup")
	private String bgroup;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	public UserProfile() {
	}

	public UserProfile(Gender gender, User user, String bgroup) {
		this.gender = gender;
		this.bgroup = bgroup;
		this.user = user;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getBgroup() {
		return bgroup;
	}

	public void setBgroup(String bgroup) {
		this.bgroup = bgroup;
	}

	public static enum Gender {
		MALE, FEMALE
	}
}
