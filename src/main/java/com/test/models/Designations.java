package com.test.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "designations")
public class Designations {

	@Id
	private int id;

	@Column
	private String title;

	@Column
	private String short_title;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getShort_title() {
		return short_title;
	}

	public void setShort_title(String short_title) {
		this.short_title = short_title;
	}

	@Override
	public String toString() {
		return "Designations [id=" + id + ", title=" + title + ", short_title=" + short_title + "]";
	}

}
