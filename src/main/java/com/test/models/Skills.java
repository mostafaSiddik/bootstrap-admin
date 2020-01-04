package com.test.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "skills")
public class Skills {

	@Id
	private int id;

	@Column
	private Integer employee_id;

	@Column
	private String presentation_skill;

	@Column
	private String language_skill;

	@Column
	private String computer_skill;

	@Column
	private String others;

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

	public String getPresentation_skill() {
		return presentation_skill;
	}

	public void setPresentation_skill(String presentation_skill) {
		this.presentation_skill = presentation_skill;
	}

	public String getLanguage_skill() {
		return language_skill;
	}

	public void setLanguage_skill(String language_skill) {
		this.language_skill = language_skill;
	}

	public String getComputer_skill() {
		return computer_skill;
	}

	public void setComputer_skill(String computer_skill) {
		this.computer_skill = computer_skill;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
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
		return "Skills [id=" + id + ", employee_id=" + employee_id + ", presentation_skill=" + presentation_skill
				+ ", language_skill=" + language_skill + ", computer_skill=" + computer_skill + ", others=" + others
				+ ", created_by=" + created_by + ", created_date=" + created_date + ", modified_by=" + modified_by
				+ ", modified_date=" + modified_date + ", _key=" + _key + "]";
	}

}
