package com.test.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "shipment_items")
public class ShipmentItem {

	@Id
	private int id;

	@Column
	private Integer shipment_id;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getShipment_id() {
		return shipment_id;
	}

	public void setShipment_id(Integer shipment_id) {
		this.shipment_id = shipment_id;
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

	@Override
	public String toString() {
		return "ShipmentItem [id=" + id + ", shipment_id=" + shipment_id + ", category_id=" + category_id
				+ ", product_id=" + product_id + ", size_id=" + size_id + ", color_id=" + color_id + ", style=" + style
				+ ", unit_id=" + unit_id + ", quantity=" + quantity + ", unit_price=" + unit_price + ", total_price="
				+ total_price + "]";
	}

}
