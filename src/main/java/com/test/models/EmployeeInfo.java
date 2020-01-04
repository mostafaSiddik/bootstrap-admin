package com.test.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "employee_info")
public class EmployeeInfo {

	@Id
	private int id;

	@Column
	private Integer company_id;

	@Column
	private Integer branch_id;

	@Column
	private Integer department_id;

	@Column
	private Integer designation_id;

	@Column
	private String first_name;

	@Column
	private String last_name;

	@Column
	private String surname;

	@Column
	private String father_name;

	@Column
	private String mother_name;

	@Column
	private Date date_of_birth;

	@Column
	private String nationality;

	@Column
	private String religion;

	@Column
	private String marital_status;

	@Column
	private String spouse_name;

	@Column
	private String email;

	@Column
	private String mobile;

	@Column
	private String phone;

	@Column
	private String driving_lincence;

	@Column
	private String quota;

	@Column
	private Integer national_id_no;

	@Column
	private String blood_group;

	@Column
	private String passport_no;

	@Column
	private String image;

	@Column
	private String joining_date;

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

	public Integer getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}

	public Integer getDesignation_id() {
		return designation_id;
	}

	public void setDesignation_id(Integer designation_id) {
		this.designation_id = designation_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFather_name() {
		return father_name;
	}

	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public String getMother_name() {
		return mother_name;
	}

	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getMarital_status() {
		return marital_status;
	}

	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}

	public String getSpouse_name() {
		return spouse_name;
	}

	public void setSpouse_name(String spouse_name) {
		this.spouse_name = spouse_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDriving_lincence() {
		return driving_lincence;
	}

	public void setDriving_lincence(String driving_lincence) {
		this.driving_lincence = driving_lincence;
	}

	public String getQuota() {
		return quota;
	}

	public void setQuota(String quota) {
		this.quota = quota;
	}

	public Integer getNational_id_no() {
		return national_id_no;
	}

	public void setNational_id_no(Integer national_id_no) {
		this.national_id_no = national_id_no;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public String getPassport_no() {
		return passport_no;
	}

	public void setPassport_no(String passport_no) {
		this.passport_no = passport_no;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getJoining_date() {
		return joining_date;
	}

	public void setJoining_date(String joining_date) {
		this.joining_date = joining_date;
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
		return "EmployeeInfo [id=" + id + ", company_id=" + company_id + ", branch_id=" + branch_id + ", department_id="
				+ department_id + ", designation_id=" + designation_id + ", first_name=" + first_name + ", last_name="
				+ last_name + ", surname=" + surname + ", father_name=" + father_name + ", mother_name=" + mother_name
				+ ", date_of_birth=" + date_of_birth + ", nationality=" + nationality + ", religion=" + religion
				+ ", marital_status=" + marital_status + ", spouse_name=" + spouse_name + ", email=" + email
				+ ", mobile=" + mobile + ", phone=" + phone + ", driving_lincence=" + driving_lincence + ", quota="
				+ quota + ", national_id_no=" + national_id_no + ", blood_group=" + blood_group + ", passport_no="
				+ passport_no + ", image=" + image + ", joining_date=" + joining_date + ", created_by=" + created_by
				+ ", created_date=" + created_date + ", modified_by=" + modified_by + ", modified_date=" + modified_date
				+ ", _key=" + _key + "]";
	}

}
