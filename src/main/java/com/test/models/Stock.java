package com.test.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity(name = "stocks")
public class Stock {

	@Id
	private int id;

	@Column
	private Integer institute_id;

	@Column
	private Integer company_id;

	@Column
	private Integer stock_transfer_id;

	@Column
	private Integer stock_entry_id;

	@Column
	private Integer stock_delivery_id;

	@Column
	private Integer sample_order_id;

	@Column
	private Integer job_order_id;

	@Column
	private Integer shipment_id;

	@Column
	@Enumerated(EnumType.STRING)
	private StockType stock_type;

	@Column
	@Enumerated(EnumType.STRING)
	private Type type;

	@Column
	private Integer category_id;

	@Column
	private Integer product_id;

	@Column
	private Integer size_id;

	@Column
	private Integer color_id;

	@Column
	private String style;

	@Column
	private Integer unit_id;

	@Column
	private Double quantity;

	@Column
	private Double unit_price;

	@Column
	private Double total_price;

	@Column
	private boolean main_store;

	@Column
	private Integer from_store_id;

	@Column
	private Integer from_location_id;

	@Column
	private Integer to_store_id;

	@Column
	private Integer to_location_id;

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

	public Integer getStock_transfer_id() {
		return stock_transfer_id;
	}

	public void setStock_transfer_id(Integer stock_transfer_id) {
		this.stock_transfer_id = stock_transfer_id;
	}

	public Integer getStock_entry_id() {
		return stock_entry_id;
	}

	public void setStock_entry_id(Integer stock_entry_id) {
		this.stock_entry_id = stock_entry_id;
	}

	public Integer getStock_delivery_id() {
		return stock_delivery_id;
	}

	public void setStock_delivery_id(Integer stock_delivery_id) {
		this.stock_delivery_id = stock_delivery_id;
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

	public Integer getShipment_id() {
		return shipment_id;
	}

	public void setShipment_id(Integer shipment_id) {
		this.shipment_id = shipment_id;
	}

	public StockType getStock_type() {
		return stock_type;
	}

	public void setStock_type(StockType stock_type) {
		this.stock_type = stock_type;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Integer getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}

	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public Integer getSize_id() {
		return size_id;
	}

	public void setSize_id(Integer size_id) {
		this.size_id = size_id;
	}

	public Integer getColor_id() {
		return color_id;
	}

	public void setColor_id(Integer color_id) {
		this.color_id = color_id;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public Integer getUnit_id() {
		return unit_id;
	}

	public void setUnit_id(Integer unit_id) {
		this.unit_id = unit_id;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(Double unit_price) {
		this.unit_price = unit_price;
	}

	public Double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(Double total_price) {
		this.total_price = total_price;
	}

	public boolean isMain_store() {
		return main_store;
	}

	public void setMain_store(boolean main_store) {
		this.main_store = main_store;
	}

	public Integer getFrom_store_id() {
		return from_store_id;
	}

	public void setFrom_store_id(Integer from_store_id) {
		this.from_store_id = from_store_id;
	}

	public Integer getFrom_location_id() {
		return from_location_id;
	}

	public void setFrom_location_id(Integer from_location_id) {
		this.from_location_id = from_location_id;
	}

	public Integer getTo_store_id() {
		return to_store_id;
	}

	public void setTo_store_id(Integer to_store_id) {
		this.to_store_id = to_store_id;
	}

	public Integer getTo_location_id() {
		return to_location_id;
	}

	public void setTo_location_id(Integer to_location_id) {
		this.to_location_id = to_location_id;
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
		return "Stock [id=" + id + ", institute_id=" + institute_id + ", company_id=" + company_id
				+ ", stock_transfer_id=" + stock_transfer_id + ", stock_entry_id=" + stock_entry_id
				+ ", stock_delivery_id=" + stock_delivery_id + ", sample_order_id=" + sample_order_id
				+ ", job_order_id=" + job_order_id + ", shipment_id=" + shipment_id + ", stock_type=" + stock_type
				+ ", type=" + type + ", category_id=" + category_id + ", product_id=" + product_id + ", size_id="
				+ size_id + ", color_id=" + color_id + ", style=" + style + ", unit_id=" + unit_id + ", quantity="
				+ quantity + ", unit_price=" + unit_price + ", total_price=" + total_price + ", main_store="
				+ main_store + ", from_store_id=" + from_store_id + ", from_location_id=" + from_location_id
				+ ", to_store_id=" + to_store_id + ", to_location_id=" + to_location_id + ", created_by=" + created_by
				+ ", created_date=" + created_date + ", modified_by=" + modified_by + ", modified_date=" + modified_date
				+ ", is_deleted=" + is_deleted + ", _key=" + _key + "]";
	}

	public enum StockType {
		OPENING, STOCK_ENTRY, STOCK_DELIVERY, FINISH_STOCK, SHIPMENT, TRANSFER;
	}

	public enum Type {
		IN, OUT;
	}

}
