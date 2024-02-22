package com.org.auto_wire.Anno;

public class Address {
	private String city;
	private String country;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Object Created Of Address Class");
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
