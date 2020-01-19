package com.test.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity(name = "sample_requisitions")
public class SampleRequisition {

	@Id
	private int id;

	@Column
	private Integer sample_order_id;

	@Column
	private Date issue_date;

	@Column
	private Date confirm_date;

	@Column
	private Integer requisition_by;

	@Column
	private Integer approved_by;

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

	public Integer getSample_order_id() {
		return sample_order_id;
	}

	public void setSample_order_id(Integer sample_order_id) {
		this.sample_order_id = sample_order_id;
	}

	public Date getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}

	public Date getConfirm_date() {
		return confirm_date;
	}

	public void setConfirm_date(Date confirm_date) {
		this.confirm_date = confirm_date;
	}

	public Integer getRequisition_by() {
		return requisition_by;
	}

	public void setRequisition_by(Integer requisition_by) {
		this.requisition_by = requisition_by;
	}

	public Integer getApproved_by() {
		return approved_by;
	}

	public void setApproved_by(Integer approved_by) {
		this.approved_by = approved_by;
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
		return "SampleRequisitions [id=" + id + ", sample_order_id=" + sample_order_id + ", issue_date=" + issue_date
				+ ", confirm_date=" + confirm_date + ", requisition_by=" + requisition_by + ", approved_by="
				+ approved_by + ", quantity=" + quantity + ", total_amount=" + total_amount + ", status=" + status
				+ ", created_by=" + created_by + ", created_date=" + created_date + ", modified_by=" + modified_by
				+ ", modified_date=" + modified_date + ", is_deleted=" + is_deleted + ", _key=" + _key + "]";
	}

	public enum Status {
		PENDING, APPROVED;
	}
}
