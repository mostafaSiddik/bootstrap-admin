package com.test.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity(name = "shipment")
public class Shipment {

	@Id
	private int id;

	@Column
	private Integer institute_id;

	@Column
	private Integer company_id;

	@Column
	private Integer buyer_id;

	@Column
	private Integer factory_id;

	@Column
	private String job_order_id;

	@Column
	private String sample_order_id;

	@Column
	private Date issue_date;

	@Column
	private Date confirm_date;

	@Column
	private Integer shipment_by;

	@Column
	private Integer received_by;

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

	public enum Status {
		PENDING, APPROVED;
	}

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

	public Integer getBuyer_id() {
		return buyer_id;
	}

	public void setBuyer_id(Integer buyer_id) {
		this.buyer_id = buyer_id;
	}

	public Integer getFactory_id() {
		return factory_id;
	}

	public void setFactory_id(Integer factory_id) {
		this.factory_id = factory_id;
	}

	public String getJob_order_id() {
		return job_order_id;
	}

	public void setJob_order_id(String job_order_id) {
		this.job_order_id = job_order_id;
	}

	public String getSample_order_id() {
		return sample_order_id;
	}

	public void setSample_order_id(String sample_order_id) {
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

	public Integer getShipment_by() {
		return shipment_by;
	}

	public void setShipment_by(Integer shipment_by) {
		this.shipment_by = shipment_by;
	}

	public Integer getReceived_by() {
		return received_by;
	}

	public void setReceived_by(Integer received_by) {
		this.received_by = received_by;
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
		return "Shipment [id=" + id + ", institute_id=" + institute_id + ", company_id=" + company_id + ", buyer_id="
				+ buyer_id + ", factory_id=" + factory_id + ", job_order_id=" + job_order_id + ", sample_order_id="
				+ sample_order_id + ", issue_date=" + issue_date + ", confirm_date=" + confirm_date + ", shipment_by="
				+ shipment_by + ", received_by=" + received_by + ", quantity=" + quantity + ", total_amount="
				+ total_amount + ", status=" + status + ", created_by=" + created_by + ", created_date=" + created_date
				+ ", modified_by=" + modified_by + ", modified_date=" + modified_date + ", is_deleted=" + is_deleted
				+ ", _key=" + _key + "]";
	}

}
