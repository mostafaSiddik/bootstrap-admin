package com.test.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "promotion_settings")
public class PromotionSettings {

	@Id
	private int id;

	@Column
	private Integer previous_designation;

	@Column
	private Integer current_designation;

	@Column
	private Integer promotion_duration;

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

	public Integer getPrevious_designation() {
		return previous_designation;
	}

	public void setPrevious_designation(Integer previous_designation) {
		this.previous_designation = previous_designation;
	}

	public Integer getCurrent_designation() {
		return current_designation;
	}

	public void setCurrent_designation(Integer current_designation) {
		this.current_designation = current_designation;
	}

	public Integer getPromotion_duration() {
		return promotion_duration;
	}

	public void setPromotion_duration(Integer promotion_duration) {
		this.promotion_duration = promotion_duration;
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
		return "PromotionSettings [id=" + id + ", previous_designation=" + previous_designation
				+ ", current_designation=" + current_designation + ", promotion_duration=" + promotion_duration
				+ ", created_by=" + created_by + ", created_date=" + created_date + ", modified_by=" + modified_by
				+ ", modified_date=" + modified_date + ", _key=" + _key + "]";
	}

}
