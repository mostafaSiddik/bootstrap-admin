package com.test.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "institutes")
public class Institute {

	@Id
	private int id;

	@Column
	private String name;

	@Column
	private String location;

	@Column
	private String phone;

	@Column
	private String mobile;

	@Column
	private String email;

	@Column
	private String code;

	@Column
	private String type;

	@Column
	private String website;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@Override
	public String toString() {
		return "Institutes [id=" + id + ", name=" + name + ", location=" + location + ", phone=" + phone + ", mobile="
				+ mobile + ", email=" + email + ", code=" + code + ", type=" + type + ", website=" + website + "]";
	}

}
