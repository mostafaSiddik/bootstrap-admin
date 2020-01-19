package com.test.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity(name = "purchases")
public class Purchase {

	@Id
	private int id;

	@Column
	private Integer institute_id;

	@Column
	private Integer company_id;

	@Column
	private Integer purchase_requisition_id;

	@Column
	private String order_no;

	@Column
	private String vendor_id;

	@Column
	private Date issue_date;

	@Column
	private Date processed_date;

	@Column
	private Integer purchased_by;

	@Column
	private Double quantity;

	@Column
	private Double total_amount;

	@Column
	@Enumerated(EnumType.STRING)
	private Status status;

	@Column
	private Integer created_by;

	@Column
	private Date created_date;

	@Column
	private Integer modified_by;

	@Column
	private Date modified_date;

	@Column
	private boolean is_deleted;

	@Column
	private String _key;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getInstitute_id() {
		return institute_id;
	}

	public void setInstitute_id(Integer institute_id) {
		this.institute_id = institute_id;
	}

	public Integer getCompany_id() {
		return company_id;
	}

	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}

	public Integer getPurchase_requisition_id() {
		return purchase_requisition_id;
	}

	public void setPurchase_requisition_id(Integer purchase_requisition_id) {
		this.purchase_requisition_id = purchase_requisition_id;
	}

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	public String getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}

	public Date getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}

	public Date getProcessed_date() {
		return processed_date;
	}

	public void setProcessed_date(Date processed_date) {
		this.processed_date = processed_date;
	}

	public Integer getPurchased_by() {
		return purchased_by;
	}

	public void setPurchased_by(Integer purchased_by) {
		this.purchased_by = purchased_by;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(Double total_amount) {
		this.total_amount = total_amount;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
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

	public boolean isIs_deleted() {
		return is_deleted;
	}

	public void setIs_deleted(boolean is_deleted) {
		this.is_deleted = is_deleted;
	}

	public String get_key() {
		return _key;
	}

	public void set_key(String _key) {
		this._key = _key;
	}

	@Override
	public String toString() {
		return "Purchase [id=" + id + ", institute_id=" + institute_id + ", company_id=" + company_id
				+ ", purchase_requisition_id=" + purchase_requisition_id + ", order_no=" + order_no + ", vendor_id="
				+ vendor_id + ", issue_date=" + issue_date + ", processed_date=" + processed_date + ", purchased_by="
				+ purchased_by + ", quantity=" + quantity + ", total_amount=" + total_amount + ", status=" + status
				+ ", created_by=" + created_by + ", created_date=" + created_date + ", modified_by=" + modified_by
				+ ", modified_date=" + modified_date + ", is_deleted=" + is_deleted + ", _key=" + _key + "]";
	}

	public enum Status {
		PENDING, APPROVED;
	}
}
