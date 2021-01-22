package com.Emart.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CategoryMaster 
{
	private int categoryMasterId;
	private String categoryName;
	private String categoryId;
	private String subCategoryName;
	private String subCategoryId;
	private String ImagePath;
	private int flag;
	
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	/**
	 * @return the categoryMasterId
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getCategoryMasterId() {
		return categoryMasterId;
	}
	/**
	 * @param categoryMasterId the categoryMasterId to set
	 */
	public void setCategoryMasterId(int categoryMasterId) {
		this.categoryMasterId = categoryMasterId;
	}
	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}
	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	/**
	 * @return the categoryId
	 */
	public String getCategoryId() {
		return categoryId;
	}
	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	/**
	 * @return the subCategoryName
	 */
	public String getSubCategoryName() {
		return subCategoryName;
	}
	/**
	 * @param subCategoryName the subCategoryName to set
	 */
	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}
	/**
	 * @return the subCategoryId
	 */
	public String getSubCategoryId() {
		return subCategoryId;
	}
	/**
	 * @param subCategoryId the subCategoryId to set
	 */
	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
	@Override
	public String toString() {
		return "CategoryMaster [categoryMasterId=" + categoryMasterId + ", categoryName=" + categoryName
				+ ", categoryId=" + categoryId + ", subCategoryName=" + subCategoryName + ", subCategoryId="
				+ subCategoryId + ", ImagePath=" + ImagePath + ", flag=" + flag + "]";
	}
	public String getImagePath() {
		return ImagePath;
	}
	public void setImagePath(String imagePath) {
		ImagePath = imagePath;
	}
	
	
}
