
package com.Emart.Models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Product 
{
	private int productId;
	private String productDescription;
	private String productName;
	private int unitStock;
	private int regularPrice;
	private int cardHolderPrice;
	private int epoints;
	private CategoryMaster categoryMasterId;
	private String productImagePath;
	
	
	/**
	 * @return
	 */
	public String getProductImagePath() {
		return productImagePath;
	}

	public void setProductImagePath(String productImagePath) {
		this.productImagePath = productImagePath;
	}

	/**
	 * @return the categoryMasterId
	 */
	
	@OneToMany(targetEntity = CategoryMaster.class,cascade = CascadeType.ALL,fetch= FetchType.EAGER)
	@JoinColumn(name = "categoryMasterId",referencedColumnName="productId")
	@Column(name="categoryMasterId")
	public CategoryMaster getCategoryMasterId() {
		return categoryMasterId;
	}

	/**
	 * @param categoryMasterId the categoryMasterId to set
	 */
	public void setCategoryMasterId(CategoryMaster categoryMasterId) {
		this.categoryMasterId = categoryMasterId;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productDescription=" + productDescription + ", productName="
				+ productName + ", unitStock=" + unitStock + ", regularPrice=" + regularPrice + ", cardHolderPrice="
				+ cardHolderPrice + ", epoints=" + epoints + ", categoryMasterId=" + categoryMasterId
				+ ", productImagePath=" + productImagePath + "]";
	}

}
