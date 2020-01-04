package com.test.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "pensions")
public class Pensions {

	@Id
	private int id;

	@Column
	private Integer last_department_id;

	@Column
	private Integer salary_id;

	@Column
	private Integer pension_percent;

	@Column
	private Float amount;

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

	public Integer getLast_department_id() {
		return last_department_id;
	}

	public void setLast_department_id(Integer last_department_id) {
		this.last_department_id = last_department_id;
	}

	public Integer getSalary_id() {
		return salary_id;
	}

	public void setSalary_id(Integer salary_id) {
		this.salary_id = salary_id;
	}

	public Integer getPension_percent() {
		return pension_percent;
	}

	public void setPension_percent(Integer pension_percent) {
		this.pension_percent = pension_percent;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
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
		return "Pensions [id=" + id + ", last_department_id=" + last_department_id + ", salary_id=" + salary_id
				+ ", pension_percent=" + pension_percent + ", amount=" + amount + ", created_by=" + created_by
				+ ", created_date=" + created_date + ", modified_by=" + modified_by + ", modified_date=" + modified_date
				+ ", _key=" + _key + "]";
	}

}
