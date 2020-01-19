package com.test.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "bank_accounts")
public class BankAccount {

	@Id
	private int id;

	@Column
	private Integer bank_id;

	@Column
	private Integer bank_branch_id;

	@Column
	private String ac_name;

	@Column
	private String ac_type;

	@Column
	private String ac_number;

	@Column
	private String code;

	@Column
	private String description;

	@Column
	private String ac_status;

	@Column
	private Double balance;

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

	@Column
	private boolean is_deleted;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getBank_id() {
		return bank_id;
	}

	public void setBank_id(Integer bank_id) {
		this.bank_id = bank_id;
	}

	public Integer getBank_branch_id() {
		return bank_branch_id;
	}

	public void setBank_branch_id(Integer bank_branch_id) {
		this.bank_branch_id = bank_branch_id;
	}

	public String getAc_name() {
		return ac_name;
	}

	public void setAc_name(String ac_name) {
		this.ac_name = ac_name;
	}

	public String getAc_type() {
		return ac_type;
	}

	public void setAc_type(String ac_type) {
		this.ac_type = ac_type;
	}

	public String getAc_number() {
		return ac_number;
	}

	public void setAc_number(String ac_number) {
		this.ac_number = ac_number;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAc_status() {
		return ac_status;
	}

	public void setAc_status(String ac_status) {
		this.ac_status = ac_status;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
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

	public boolean isIs_deleted() {
		return is_deleted;
	}

	public void setIs_deleted(boolean is_deleted) {
		this.is_deleted = is_deleted;
	}

	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", bank_id=" + bank_id + ", bank_branch_id=" + bank_branch_id + ", ac_name="
				+ ac_name + ", ac_type=" + ac_type + ", ac_number=" + ac_number + ", code=" + code + ", description="
				+ description + ", ac_status=" + ac_status + ", balance=" + balance + ", created_by=" + created_by
				+ ", created_date=" + created_date + ", modified_by=" + modified_by + ", modified_date=" + modified_date
				+ ", _key=" + _key + ", is_deleted=" + is_deleted + "]";
	}

}
