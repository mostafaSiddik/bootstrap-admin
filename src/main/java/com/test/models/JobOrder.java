package com.test.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity(name = "job_orders")
public class JobOrder {

	@Id
	private int id;

	@Column
	private Integer sample_order_id;

	@Column
	private Integer institute_id;

	@Column
	private Integer company_id;

	@Column
	private Integer buyer_id;

	@Column
	private String order_no;

	@Column
	private Integer factory_id;

	@Column
	private String po_no;

	@Column
	private Date issue_date;

	@Column
	private Date order_date;

	@Column
	private Date delivery_date;

	@Column
	private String reference;

	@Column
	private String terms;

	@Column
	private String merchandiser;

	@Column
	private Integer receive_person_id;

	@Column
	private Double quantity;

	@Column
	private Double total_amount;

	@Column
	private String sample_design;

	@Column
	@Enumerated(EnumType.STRING)
	private OrderStatus order_status;

	@Column
	@Enumerated(EnumType.STRING)
	private StockStatus stock_status;

	@Column
	@Enumerated(EnumType.STRING)
	private DeliveryStatus delivery_status;

	@Column
	@Enumerated(EnumType.STRING)
	private ProductionStatus production_status;

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

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	public Integer getFactory_id() {
		return factory_id;
	}

	public void setFactory_id(Integer factory_id) {
		this.factory_id = factory_id;
	}

	public String getPo_no() {
		return po_no;
	}

	public void setPo_no(String po_no) {
		this.po_no = po_no;
	}

	public Date getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	public Date getDelivery_date() {
		return delivery_date;
	}

	public void setDelivery_date(Date delivery_date) {
		this.delivery_date = delivery_date;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getTerms() {
		return terms;
	}

	public void setTerms(String terms) {
		this.terms = terms;
	}

	public String getMerchandiser() {
		return merchandiser;
	}

	public void setMerchandiser(String merchandiser) {
		this.merchandiser = merchandiser;
	}

	public Integer getReceive_person_id() {
		return receive_person_id;
	}

	public void setReceive_person_id(Integer receive_person_id) {
		this.receive_person_id = receive_person_id;
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

	public String getSample_design() {
		return sample_design;
	}

	public void setSample_design(String sample_design) {
		this.sample_design = sample_design;
	}

	public OrderStatus getOrder_status() {
		return order_status;
	}

	public void setOrder_status(OrderStatus order_status) {
		this.order_status = order_status;
	}

	public StockStatus getStock_status() {
		return stock_status;
	}

	public void setStock_status(StockStatus stock_status) {
		this.stock_status = stock_status;
	}

	public DeliveryStatus getDelivery_status() {
		return delivery_status;
	}

	public void setDelivery_status(DeliveryStatus delivery_status) {
		this.delivery_status = delivery_status;
	}

	public ProductionStatus getProduction_status() {
		return production_status;
	}

	public void setProduction_status(ProductionStatus production_status) {
		this.production_status = production_status;
	}

	public int getCreated_by() {
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

	public int getModified_by() {
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
		return "JobOrders [id=" + id + ", sample_order_id=" + sample_order_id + ", institute_id=" + institute_id
				+ ", company_id=" + company_id + ", buyer_id=" + buyer_id + ", order_no=" + order_no + ", factory_id="
				+ factory_id + ", po_no=" + po_no + ", issue_date=" + issue_date + ", order_date=" + order_date
				+ ", delivery_date=" + delivery_date + ", reference=" + reference + ", terms=" + terms
				+ ", merchandiser=" + merchandiser + ", receive_person_id=" + receive_person_id + ", quantity="
				+ quantity + ", total_amount=" + total_amount + ", sample_design=" + sample_design + ", order_status="
				+ order_status + ", stock_status=" + stock_status + ", delivery_status=" + delivery_status
				+ ", production_status=" + production_status + ", created_by=" + created_by + ", created_date="
				+ created_date + ", modified_by=" + modified_by + ", modified_date=" + modified_date + ", is_deleted="
				+ is_deleted + ", _key=" + _key + "]";
	}

	public enum OrderStatus {
		PENDING, APPROVED;
	}

	public enum StockStatus {
		PENDING, COMPLETE;
	}

	public enum DeliveryStatus {
		DUE, DELIVERED;
	}

	public enum ProductionStatus {
		YES, NO;
	}
}
