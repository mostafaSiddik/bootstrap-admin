package com.test.my_packages.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "users")
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pKey;

	@Column
	@Enumerated(EnumType.STRING)
	private UserType userType;

	@Column
	private int userId;

	@Column(unique = true)
	private String email;

	@Column
	private String password;

	public int getpKey() {
		return pKey;
	}

	public void setpKey(int pKey) {
		this.pKey = pKey;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	@Override
	public String toString() {
		return "User [pKey=" + pKey + ", userType=" + userType + ", userId=" + userId + ", email=" + email
				+ ", password=" + password + "]";
	}

	public enum UserType {
		ADMIN, STAFF, CUSTOMER;
	}
}
