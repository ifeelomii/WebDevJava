package com.demo.model;

public class Address {
	private int add_id;
	private String street;
	private String city;
	
	public Address() {
		super();
	}
	public Address(int add_id, String street, String city) {
		super();
		this.add_id = add_id;
		this.street = street;
		this.city = city;
	}
	public int getAdd_id() {
		return add_id;
	}
	public void setAdd_id(int add_id) {
		this.add_id = add_id;
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
	@Override
	public String toString() {
		return "Address [add_id=" + add_id + ", street=" + street + ", city=" + city + "]";
	}
		
}
