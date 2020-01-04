package com.test.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "user_permissions")
public class UserPermissions {

	@Id
	private int id;

	@Column
	private Integer user_id;

	@Column
	private String user_types;

	@Column
	private String permissions;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getUser_types() {
		return user_types;
	}

	public void setUser_types(String user_types) {
		this.user_types = user_types;
	}

	public String getPermissions() {
		return permissions;
	}

	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}

	@Override
	public String toString() {
		return "UserPermissions [id=" + id + ", user_id=" + user_id + ", user_types=" + user_types + ", permissions="
				+ permissions + "]";
	}

}
