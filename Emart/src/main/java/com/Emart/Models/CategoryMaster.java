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
	private int categoryId;
	private String subCategoryName;
	private int subCategoryId;
	private String categoryImagePath;
	private String subCategoryImagePath;
	private boolean Flag;
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
	public int getCategoryId() {
		return categoryId;
	}
	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(int categoryId) {
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
	public int getSubCategoryId() {
		return subCategoryId;
	}
	/**
	 * @param subCategoryId the subCategoryId to set
	 */
	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
	/**
	 * @return the categoryImagePath
	 */
	public String getCategoryImagePath() {
		return categoryImagePath;
	}
	/**
	 * @param categoryImagePath the categoryImagePath to set
	 */
	public void setCategoryImagePath(String categoryImagePath) {
		this.categoryImagePath = categoryImagePath;
	}
	/**
	 * @return the subCategoryImagePath
	 */
	public String getSubCategoryImagePath() {
		return subCategoryImagePath;
	}
	/**
	 * @param subCategoryImagePath the subCategoryImagePath to set
	 */
	public void setSubCategoryImagePath(String subCategoryImagePath) {
		this.subCategoryImagePath = subCategoryImagePath;
	}
	/**
	 * @return the flag
	 */
	public boolean isFlag() {
		return Flag;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CategoryMaster [categoryMasterId=" + categoryMasterId + ", categoryName=" + categoryName
				+ ", categoryId=" + categoryId + ", subCategoryName=" + subCategoryName + ", subCategoryId="
				+ subCategoryId + ", categoryImagePath=" + categoryImagePath + ", subCategoryImagePath="
				+ subCategoryImagePath + ", Flag=" + Flag + "]";
	}
	/**
	 * @param flag the flag to set
	 */
	public void setFlag(boolean flag) {
		Flag = flag;
	}
}
