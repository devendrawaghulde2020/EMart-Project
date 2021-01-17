package com.Emart.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ShippingAddress")
public class ShippingAddress 
{
	
	private int shippingAddressId;
	private String address;
	private String city;
	private String state;
	private String pincode;
	private String country;
	
	@Override
	public String toString() {
		return "ShippingAddress [shippingAddressId=" + shippingAddressId + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", pincode=" + pincode + ", country=" + country + "]";
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getShippingAddressId() {
		return shippingAddressId;
	}
	public void setShippingAddressId(int shippingAddressId) {
		this.shippingAddressId = shippingAddressId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
