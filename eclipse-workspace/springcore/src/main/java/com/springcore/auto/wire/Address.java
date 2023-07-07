package com.springcore.auto.wire;

public class Address {
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	private String street;
	private String city;
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
	
}
