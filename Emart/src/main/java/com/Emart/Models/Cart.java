package com.Emart.Models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.springframework.data.annotation.Transient;

@Entity
public class Cart 
{
	private int cartId;
	private int productId;
	private int userId;
	private float totalPrice;
	private List<Product> product;
	private List<User> user;
	private int Quantity;
	
	 @OneToMany(fetch = FetchType.LAZY)
	    @Transient
		@JoinColumn(name = "productId", referencedColumnName = "productId", insertable = false, updatable = false)
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	
	 @OneToMany(fetch = FetchType.LAZY)
	    @Transient
		@JoinColumn(name = "userId", referencedColumnName = "userId", insertable = false, updatable = false)
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	
	
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	

}
