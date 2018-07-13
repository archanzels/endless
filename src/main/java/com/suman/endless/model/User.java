package com.suman.endless.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer id;

	@Email(message = "Please provide a valid email.")
	@NotEmpty
	@Column(name = "email")
	private String email;

	@Length(min = 6, message = "Password must be at least 6 characters.")
	@Column(name = "password")
	private String password;

	@NotEmpty
	@Column(name = "first_name")
	private String firstName;

	@NotEmpty
	@Column(name = "last_name")
	private String lastName;

	/* For Search */
	@NotEmpty
	@Column(name = "bgroup")
	private String bgroup;

	/* For Location */
	@Column(name = "location")
	@NotEmpty
	private String location;

	@Column(name = "lat")
	private double lat;

	@Column(name = "lng")
	private double lng;

	@Column(name = "dist")
	private float dist;

	@Column(name = "active")
	private boolean active;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "user")
	private UserProfile userProfile;

	public User() {
	}

	public User(@Email(message = "Please provide a valid email.") @NotEmpty String email,
			@Length(min = 6, message = "Password must be at least 6 characters.") @NotEmpty String password,
			@NotEmpty String firstName, @NotEmpty String lastName, boolean active, Set<Role> roles, String bgroup,
			String location, double lat, double lng, float dist, UserProfile userProfile) {
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.active = active;
		this.roles = roles;
		this.bgroup = bgroup;
		this.location = location;
		this.lat = lat;
		this.lng = lng;
		this.dist = dist;
		this.userProfile = userProfile;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public boolean getActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public String getBgroup() {
		return bgroup;
	}

	public void setBgroup(String bgroup) {
		this.bgroup = bgroup;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public double getDist() {
		return dist;
	}

	public void setDist(float dist) {
		this.dist = dist;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}
}
