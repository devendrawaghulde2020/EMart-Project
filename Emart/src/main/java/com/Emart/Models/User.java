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
	private static final long serialVersionUID = 154446665656L;

	private int userId;
	
	private String firstName;
	private String lastName;
	private String customerPhone;
	private String emailId;
	private String username;
	private String password;
	private int royalFlag;
	
	@ElementCollection
	private Set<ShippingAddress> shippingAddress;


	@OneToMany(targetEntity= ShippingAddress.class ,cascade = CascadeType.ALL,fetch= FetchType.EAGER)
	@JoinColumn(name ="ShippingAddress", referencedColumnName="userId")
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
	public int isRoyalFlag() {
		return royalFlag;
	}

	/**
	 * @param royalFlag the royalFlag to set
	 */
	public void setRoyalFlag(int royalFlag) {
		this.royalFlag = royalFlag;
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "UserId")
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
		return emailId;
	}
	public void setEmail_id(String email_id) {
		this.emailId = email_id;
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
				+ customerPhone + ", email_id=" + emailId + ", username=" + username + ", password=" + password
				+ ", royalFlag=" + royalFlag + ", shippingAddress=" + shippingAddress + "]";
	}
  
}
