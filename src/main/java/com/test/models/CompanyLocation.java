package com.test.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "company_location")
public class CompanyLocation {

	@Id
	private int id;

	@Column
	private Integer company_id;

	@Column
	private Integer branch_id;

	@Column
	private Integer depertment_id;

	@Column
	private String house_no;

	@Column
	private String holding_no;

	@Column
	private String street;

	@Column
	private String city;

	@Column
	private String thana;

	@Column
	private String zip_code;

	@Column
	private String district;

	@Column
	private String country;

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

	public Integer getCompany_id() {
		return company_id;
	}

	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}

	public Integer getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(Integer branch_id) {
		this.branch_id = branch_id;
	}

	public Integer getDepertment_id() {
		return depertment_id;
	}

	public void setDepertment_id(Integer depertment_id) {
		this.depertment_id = depertment_id;
	}

	public String getHouse_no() {
		return house_no;
	}

	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}

	public String getHolding_no() {
		return holding_no;
	}

	public void setHolding_no(String holding_no) {
		this.holding_no = holding_no;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getThana() {
		return thana;
	}

	public void setThana(String thana) {
		this.thana = thana;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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
		return "CompanyLocation [id=" + id + ", company_id=" + company_id + ", branch_id=" + branch_id
				+ ", depertment_id=" + depertment_id + ", house_no=" + house_no + ", holding_no=" + holding_no
				+ ", street=" + street + ", city=" + city + ", thana=" + thana + ", zip_code=" + zip_code
				+ ", district=" + district + ", country=" + country + ", created_by=" + created_by + ", created_date="
				+ created_date + ", modified_by=" + modified_by + ", modified_date=" + modified_date + ", _key=" + _key
				+ "]";
	}

}
