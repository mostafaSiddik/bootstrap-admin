package com.test.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "leave_approval")
public class LeaveApproval {

	@Id
	private int id;

	@Column
	private Integer leave_application_id;

	@Column
	private Integer authorized_person;

	@Column
	private String status;

	@Column
	private String Comments;

	@Column
	private String confirmation_email;

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

	public Integer getLeave_application_id() {
		return leave_application_id;
	}

	public void setLeave_application_id(Integer leave_application_id) {
		this.leave_application_id = leave_application_id;
	}

	public Integer getAuthorized_person() {
		return authorized_person;
	}

	public void setAuthorized_person(Integer authorized_person) {
		this.authorized_person = authorized_person;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComments() {
		return Comments;
	}

	public void setComments(String comments) {
		Comments = comments;
	}

	public String getConfirmation_email() {
		return confirmation_email;
	}

	public void setConfirmation_email(String confirmation_email) {
		this.confirmation_email = confirmation_email;
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
		return "LeaveApproval [id=" + id + ", leave_application_id=" + leave_application_id + ", authorized_person="
				+ authorized_person + ", status=" + status + ", Comments=" + Comments + ", confirmation_email="
				+ confirmation_email + ", created_by=" + created_by + ", created_date=" + created_date
				+ ", modified_by=" + modified_by + ", modified_date=" + modified_date + ", _key=" + _key + "]";
	}

}
