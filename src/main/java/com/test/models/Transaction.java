package com.test.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity(name = "transactions")
public class Transaction {

	@Id
	private int id;

	@Column
	private Date transaction_date;

	@Column
	private Date process_date;

	@Column
	private Integer institute_id;

	@Column
	private Integer company_id;

	@Column
	private Integer sample_order_id;

	@Column
	private Integer job_order_id;

	@Column
	private Integer buyer_id;

	@Column
	private Integer factory_id;

	@Column
	private Integer employee_id;

	@Column
	private Integer stock_entry_id;

	@Column
	private Integer vendor_id;

	@Column
	private Integer purchase_id;

	@Column
	private Integer purchase_requisition_id;

	@Column
	private Integer shipment_id;

	@Column
	private Integer from_head_id;

	@Column
	private Integer from_subhead_id;

	@Column
	private Integer from_particular_id;

	@Column
	private Integer to_head_id;

	@Column
	private Integer to_subhead_id;

	@Column
	private Integer to_particular_id;

	@Column
	@Enumerated(EnumType.STRING)
	private VoucherType voucher_type;

	@Column
	@Enumerated(EnumType.STRING)
	private PaymentType payment_type;

	@Column
	@Enumerated(EnumType.STRING)
	private Type type;

	@Column
	@Enumerated(EnumType.STRING)
	private PaymentStatus payment_status;

	@Column
	private String by_whom;

	@Column
	private String description;

	@Column
	private Double debit;

	@Column
	private Double credit;

	@Column
	private Double amount;

	@Column
	private Integer payment_by;

	@Column
	private Integer received_by;

	@Column
	private Integer bank_id;

	@Column
	private Integer bank_branch_id;

	@Column
	private Integer bank_account_id;

	@Column
	private String check_no;

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

	public enum VoucherType {
		PAYMENT, RECEIVE, JOURNAL;
	}

	public enum PaymentType {
		CASH, BANK, DUE;
	}

	public enum Type {
		DEBIT, CREDIT;
	}

	public enum PaymentStatus {
		PENDING, PROCESSED, COMPLETED;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getTransaction_date() {
		return transaction_date;
	}

	public void setTransaction_date(Date transaction_date) {
		this.transaction_date = transaction_date;
	}

	public Date getProcess_date() {
		return process_date;
	}

	public void setProcess_date(Date process_date) {
		this.process_date = process_date;
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

	public Integer getSample_order_id() {
		return sample_order_id;
	}

	public void setSample_order_id(Integer sample_order_id) {
		this.sample_order_id = sample_order_id;
	}

	public Integer getJob_order_id() {
		return job_order_id;
	}

	public void setJob_order_id(Integer job_order_id) {
		this.job_order_id = job_order_id;
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

	public Integer getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}

	public Integer getStock_entry_id() {
		return stock_entry_id;
	}

	public void setStock_entry_id(Integer stock_entry_id) {
		this.stock_entry_id = stock_entry_id;
	}

	public Integer getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(Integer vendor_id) {
		this.vendor_id = vendor_id;
	}

	public Integer getPurchase_id() {
		return purchase_id;
	}

	public void setPurchase_id(Integer purchase_id) {
		this.purchase_id = purchase_id;
	}

	public Integer getPurchase_requisition_id() {
		return purchase_requisition_id;
	}

	public void setPurchase_requisition_id(Integer purchase_requisition_id) {
		this.purchase_requisition_id = purchase_requisition_id;
	}

	public Integer getShipment_id() {
		return shipment_id;
	}

	public void setShipment_id(Integer shipment_id) {
		this.shipment_id = shipment_id;
	}

	public Integer getFrom_head_id() {
		return from_head_id;
	}

	public void setFrom_head_id(Integer from_head_id) {
		this.from_head_id = from_head_id;
	}

	public Integer getFrom_subhead_id() {
		return from_subhead_id;
	}

	public void setFrom_subhead_id(Integer from_subhead_id) {
		this.from_subhead_id = from_subhead_id;
	}

	public Integer getFrom_particular_id() {
		return from_particular_id;
	}

	public void setFrom_particular_id(Integer from_particular_id) {
		this.from_particular_id = from_particular_id;
	}

	public Integer getTo_head_id() {
		return to_head_id;
	}

	public void setTo_head_id(Integer to_head_id) {
		this.to_head_id = to_head_id;
	}

	public Integer getTo_subhead_id() {
		return to_subhead_id;
	}

	public void setTo_subhead_id(Integer to_subhead_id) {
		this.to_subhead_id = to_subhead_id;
	}

	public Integer getTo_particular_id() {
		return to_particular_id;
	}

	public void setTo_particular_id(Integer to_particular_id) {
		this.to_particular_id = to_particular_id;
	}

	public VoucherType getVoucher_type() {
		return voucher_type;
	}

	public void setVoucher_type(VoucherType voucher_type) {
		this.voucher_type = voucher_type;
	}

	public PaymentType getPayment_type() {
		return payment_type;
	}

	public void setPayment_type(PaymentType payment_type) {
		this.payment_type = payment_type;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public PaymentStatus getPayment_status() {
		return payment_status;
	}

	public void setPayment_status(PaymentStatus payment_status) {
		this.payment_status = payment_status;
	}

	public String getBy_whom() {
		return by_whom;
	}

	public void setBy_whom(String by_whom) {
		this.by_whom = by_whom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getDebit() {
		return debit;
	}

	public void setDebit(Double debit) {
		this.debit = debit;
	}

	public Double getCredit() {
		return credit;
	}

	public void setCredit(Double credit) {
		this.credit = credit;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Integer getPayment_by() {
		return payment_by;
	}

	public void setPayment_by(Integer payment_by) {
		this.payment_by = payment_by;
	}

	public Integer getReceived_by() {
		return received_by;
	}

	public void setReceived_by(Integer received_by) {
		this.received_by = received_by;
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

	public Integer getBank_account_id() {
		return bank_account_id;
	}

	public void setBank_account_id(Integer bank_account_id) {
		this.bank_account_id = bank_account_id;
	}

	public String getCheck_no() {
		return check_no;
	}

	public void setCheck_no(String check_no) {
		this.check_no = check_no;
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
		return "Transaction [id=" + id + ", transaction_date=" + transaction_date + ", process_date=" + process_date
				+ ", institute_id=" + institute_id + ", company_id=" + company_id + ", sample_order_id="
				+ sample_order_id + ", job_order_id=" + job_order_id + ", buyer_id=" + buyer_id + ", factory_id="
				+ factory_id + ", employee_id=" + employee_id + ", stock_entry_id=" + stock_entry_id + ", vendor_id="
				+ vendor_id + ", purchase_id=" + purchase_id + ", purchase_requisition_id=" + purchase_requisition_id
				+ ", shipment_id=" + shipment_id + ", from_head_id=" + from_head_id + ", from_subhead_id="
				+ from_subhead_id + ", from_particular_id=" + from_particular_id + ", to_head_id=" + to_head_id
				+ ", to_subhead_id=" + to_subhead_id + ", to_particular_id=" + to_particular_id + ", voucher_type="
				+ voucher_type + ", payment_type=" + payment_type + ", type=" + type + ", payment_status="
				+ payment_status + ", by_whom=" + by_whom + ", description=" + description + ", debit=" + debit
				+ ", credit=" + credit + ", amount=" + amount + ", payment_by=" + payment_by + ", received_by="
				+ received_by + ", bank_id=" + bank_id + ", bank_branch_id=" + bank_branch_id + ", bank_account_id="
				+ bank_account_id + ", check_no=" + check_no + ", created_by=" + created_by + ", created_date="
				+ created_date + ", modified_by=" + modified_by + ", modified_date=" + modified_date + ", is_deleted="
				+ is_deleted + ", _key=" + _key + "]";
	}

}
