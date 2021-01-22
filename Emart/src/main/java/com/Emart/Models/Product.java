
package com.Emart.Models;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.data.annotation.Transient;

@Entity
public class Product implements Serializable
{
	private int productId;
	private String productDescription;
	private String productName;
	private int unitStock;
	private int regularPrice;
	private int cardHolderPrice;
	private int epoints;
	private int categoryMasterId;
	@ElementCollection
	private List<CategoryMaster> categoryMaster;
	private String productImagePath;
	
	
	
	 @OneToMany(fetch = FetchType.LAZY)
	    @Transient
		@JoinColumn(name = "categoryMasterId", referencedColumnName = "categoryMasterId", insertable = false, updatable = false)
	public List<CategoryMaster> getCategoryMaster() {
		return categoryMaster;
	}

	public void setCategoryMaster(List<CategoryMaster> categoryMaster) {
		this.categoryMaster = categoryMaster;
	}

	public int getCategoryMasterId() {
		return categoryMasterId;
	}

	public void setCategoryMasterId(int categoryMasterId) {
		this.categoryMasterId = categoryMasterId;
	}

	/**
	 * @return
	 */
	public String getProductImagePath() {
		return productImagePath;
	}

	public void setProductImagePath(String productImagePath) {
		this.productImagePath = productImagePath;
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getProductId() {
		return productId;
	}
	

	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getUnitStock() {
		return unitStock;
	}
	public void setUnitStock(int unitStock) {
		this.unitStock = unitStock;
	}
	public int getRegularPrice() {
		return regularPrice;
	}
	public void setRegularPrice(int regularPrice) {
		this.regularPrice = regularPrice;
	}
	public int getCardHolderPrice() {
		return cardHolderPrice;
	}
	public void setCardHolderPrice(int cardHolderPrice) {
		this.cardHolderPrice = cardHolderPrice;
	}
	public int getEpoints() {
		return epoints;
	}
	public void setEpoints(int epoints) {
		this.epoints = epoints;
	}

}
