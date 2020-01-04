package com.test.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "users")
public class Users {

	@Id
	private int id;

	@Column
	private Integer employee_id;

	@Column
	private Integer institute_id;

	@Column
	private String name;

	@Column
	private String email;

	@Column
	private String password;

	@Column
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}

	public Integer getInstitute_id() {
		return institute_id;
	}

	public void setInstitute_id(Integer institute_id) {
		this.institute_id = institute_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", employee_id=" + employee_id + ", institute_id=" + institute_id + ", name=" + name
				+ ", email=" + email + ", password=" + password + ", status=" + status + "]";
	}

}
