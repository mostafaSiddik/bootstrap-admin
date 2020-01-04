package com.test.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "promotions")
public class Promotions {

	@Id
	private int id;

	@Column
	private Integer employee_id;

	@Column
	private Integer previous_departments;

	@Column
	private Integer current_departments;

	@Column
	private String promotion_purpose;

	@Column
	private Date date;

	@Column
	private String comments;

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

	public Integer getPrevious_departments() {
		return previous_departments;
	}

	public void setPrevious_departments(Integer previous_departments) {
		this.previous_departments = previous_departments;
	}

	public Integer getCurrent_departments() {
		return current_departments;
	}

	public void setCurrent_departments(Integer current_departments) {
		this.current_departments = current_departments;
	}

	public String getPromotion_purpose() {
		return promotion_purpose;
	}

	public void setPromotion_purpose(String promotion_purpose) {
		this.promotion_purpose = promotion_purpose;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
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
		return "Promotions [id=" + id + ", employee_id=" + employee_id + ", previous_departments="
				+ previous_departments + ", current_departments=" + current_departments + ", promotion_purpose="
				+ promotion_purpose + ", date=" + date + ", comments=" + comments + ", created_by=" + created_by
				+ ", created_date=" + created_date + ", modified_by=" + modified_by + ", modified_date=" + modified_date
				+ ", _key=" + _key + "]";
	}

}
