package com.test.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "increment_salary")
public class IncrementSalary {
	@Id
	private int id;

	@Column
	private Integer employee_id;

	@Column
	private Integer salary_id;

	@Column
	private Double increment_amount;

	@Column
	private Double total_salary;

	@Column
	private String comments;

	@Column
	private Date date;

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

	public Integer getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}

	public Integer getSalary_id() {
		return salary_id;
	}

	public void setSalary_id(Integer salary_id) {
		this.salary_id = salary_id;
	}

	public Double getIncrement_amount() {
		return increment_amount;
	}

	public void setIncrement_amount(Double increment_amount) {
		this.increment_amount = increment_amount;
	}

	public Double getTotal_salary() {
		return total_salary;
	}

	public void setTotal_salary(Double total_salary) {
		this.total_salary = total_salary;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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
		return "IncrementSalary [id=" + id + ", employee_id=" + employee_id + ", salary_id=" + salary_id
				+ ", increment_amount=" + increment_amount + ", total_salary=" + total_salary + ", comments=" + comments
				+ ", date=" + date + ", created_by=" + created_by + ", created_date=" + created_date + ", modified_by="
				+ modified_by + ", modified_date=" + modified_date + ", _key=" + _key + "]";
	}

}
