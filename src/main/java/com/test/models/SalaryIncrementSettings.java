package com.test.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "salary_increment_settings")
public class SalaryIncrementSettings {

	@Id
	private int id;

	@Column
	private Integer department_id;

	@Column
	private Float increment_amount;

	@Column
	private Date increment_date;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}

	public Float getIncrement_amount() {
		return increment_amount;
	}

	public void setIncrement_amount(Float increment_amount) {
		this.increment_amount = increment_amount;
	}

	public Date getIncrement_date() {
		return increment_date;
	}

	public void setIncrement_date(Date increment_date) {
		this.increment_date = increment_date;
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

	@Override
	public String toString() {
		return "SalaryIncrementSettings [id=" + id + ", department_id=" + department_id + ", increment_amount="
				+ increment_amount + ", increment_date=" + increment_date + ", created_by=" + created_by
				+ ", created_date=" + created_date + ", modified_by=" + modified_by + ", modified_date=" + modified_date
				+ ", _key=" + _key + "]";
	}

}
