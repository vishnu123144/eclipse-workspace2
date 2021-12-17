package com.brillio.springcoreex.model;

public class Address {
	String houseNo;
	String street;
	String city;
	int pincode;
	
	public Address()
	{
		
	}

	public Address(String houseNo, String street, String city, int pincode) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
	}
    
	
}
