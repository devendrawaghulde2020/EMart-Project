package com.Emart.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Orders 
{
	private int orderId;
	private User user;
	private ShippingAddress shippingAddress;
	private double amount;
	private String orderDate;
	private Product productId;

	
	public Product getProductId() {
		return productId;
	}
	public void setProductId(Product productId) {
		this.productId = productId;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	/**
	 * @return the orderDate
	 */
	public String getOrderDate() {
		return orderDate;
	}
	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", user=" + user + ", shippingAddress=" + shippingAddress + ", amount="
				+ amount + ", orderDate=" + orderDate + ", productId=" + productId + "]";
	}
	
}
