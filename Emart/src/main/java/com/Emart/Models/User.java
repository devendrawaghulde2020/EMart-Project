package com.Emart.Models;

import java.io.Serializable;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 154446665656L;

	private int userId;
	
	private String firstName;
	private String lastName;
	private String customerPhone;
	private String email_id;
	private String username;
	private String password;
	private boolean royalFlag;
	
	@ElementCollection
	private Set<ShippingAddress> shippingAddress;


	@OneToMany(targetEntity = ShippingAddress.class,cascade = CascadeType.ALL,fetch= FetchType.EAGER)
	@JoinColumn(name = "ShippingAddress",referencedColumnName="userId")
	@Column(name="ShippingAddress")
	
	public Set<ShippingAddress> getShippingAddress()
	{
		return shippingAddress;
	}	

	public void setShippingAddress(Set<ShippingAddress> shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	/**
	 * @return the royalFlag
	 */
	public boolean isRoyalFlag() {
		return royalFlag;
	}

	/**
	 * @param royalFlag the royalFlag to set
	 */
	public void setRoyalFlag(boolean royalFlag) {
		this.royalFlag = royalFlag;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", customerPhone="
				+ customerPhone + ", email_id=" + email_id + ", username=" + username + ", password=" + password
				+ ", royalFlag=" + royalFlag + ", shippingAddress=" + shippingAddress + "]";
	}
  
}
