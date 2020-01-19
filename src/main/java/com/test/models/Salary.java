package com.test.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "salary")
public class Salary {

	@Id
	private int id;

	@Column
	private Integer employee_id;

	@Column
	private Integer department_id;

	@Column
	private String grade;

	@Column
	private Double basic_salary;

	@Column
	private Double house_rent;

	@Column
	private Double ta;

	@Column
	private Double da;

	@Column
	private Double medical_allownce;

	@Column
	private Double provident_fund;

	@Column
	private Double others;

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

	public Integer getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Double getBasic_salary() {
		return basic_salary;
	}

	public void setBasic_salary(Double basic_salary) {
		this.basic_salary = basic_salary;
	}

	public Double getHouse_rent() {
		return house_rent;
	}

	public void setHouse_rent(Double house_rent) {
		this.house_rent = house_rent;
	}

	public Double getTa() {
		return ta;
	}

	public void setTa(Double ta) {
		this.ta = ta;
	}

	public Double getDa() {
		return da;
	}

	public void setDa(Double da) {
		this.da = da;
	}

	public Double getMedical_allownce() {
		return medical_allownce;
	}

	public void setMedical_allownce(Double medical_allownce) {
		this.medical_allownce = medical_allownce;
	}

	public Double getProvident_fund() {
		return provident_fund;
	}

	public void setProvident_fund(Double provident_fund) {
		this.provident_fund = provident_fund;
	}

	public Double getOthers() {
		return others;
	}

	public void setOthers(Double others) {
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
		return "Salary [id=" + id + ", employee_id=" + employee_id + ", department_id=" + department_id + ", grade="
				+ grade + ", basic_salary=" + basic_salary + ", house_rent=" + house_rent + ", ta=" + ta + ", da=" + da
				+ ", medical_allownce=" + medical_allownce + ", provident_fund=" + provident_fund + ", others=" + others
				+ ", created_by=" + created_by + ", created_date=" + created_date + ", modified_by=" + modified_by
				+ ", modified_date=" + modified_date + ", _key=" + _key + "]";
	}

}
