package com.test.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "particulars")
public class Particular {

	@Id
	private int id;

	@Column
	private Integer head_id;

	@Column
	private Integer subhead_id;

	@Column
	private String name;

	@Column
	private String code;

	@Column
	private String description;

	@Column
	private Integer created_by;

	@Column
	private Date created_date;

	@Column
	private Integer modified_by;

	@Column
	private Date modified_date;

	@Column
	private String _key;

	@Column
	private boolean is_deleted;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getHead_id() {
		return head_id;
	}

	public void setHead_id(Integer head_id) {
		this.head_id = head_id;
	}

	public Integer getSubhead_id() {
		return subhead_id;
	}

	public void setSubhead_id(Integer subhead_id) {
		this.subhead_id = subhead_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getCreated_by() {
		return created_by;
	}

	public void setCreated_by(Integer created_by) {
		this.created_by = created_by;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Integer getModified_by() {
		return modified_by;
	}

	public void setModified_by(Integer modified_by) {
		this.modified_by = modified_by;
	}

	public Date getModified_date() {
		return modified_date;
	}

	public void setModified_date(Date modified_date) {
		this.modified_date = modified_date;
	}

	public String get_key() {
		return _key;
	}

	public void set_key(String _key) {
		this._key = _key;
	}

	public boolean isIs_deleted() {
		return is_deleted;
	}

	public void setIs_deleted(boolean is_deleted) {
		this.is_deleted = is_deleted;
	}

	@Override
	public String toString() {
		return "Particular [id=" + id + ", head_id=" + head_id + ", subhead_id=" + subhead_id + ", name=" + name
				+ ", code=" + code + ", description=" + description + ", created_by=" + created_by + ", created_date="
				+ created_date + ", modified_by=" + modified_by + ", modified_date=" + modified_date + ", _key=" + _key
				+ ", is_deleted=" + is_deleted + "]";
	}

}
