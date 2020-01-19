package com.test.models;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "user_permissions")
public class UserPermission {

	@Id
	private int id;

	@Column
	private Integer user_id;

	@Column
	private String user_type;

	@Column
	private String[] permissions;

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

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public String[] getPermissions() {
		return permissions;
	}

	public void setPermissions(String[] permissions) {
		this.permissions = permissions;
	}

	@Override
	public String toString() {
		return "UserPermission [id=" + id + ", user_id=" + user_id + ", user_type=" + user_type + ", permissions="
				+ Arrays.toString(permissions) + "]";
	}

}
