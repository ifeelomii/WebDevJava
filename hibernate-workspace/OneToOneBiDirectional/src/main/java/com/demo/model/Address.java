package com.demo.model;

import javax.persistence.*;

@Entity
@Table(name="add_tbl")
public class Address {
	@Id
	private int addid;
	private String street;
	private String city;
	@OneToOne(mappedBy="addr")
	private User user;
	
	public Address() {
		super();
	}
	public Address(int addid, String street, String city) {
		super();
		this.addid = addid;
		this.street = street;
		this.city = city;
	}
	public Address(int addid, String street, String city, User user) {
		super();
		this.addid = addid;
		this.street = street;
		this.city = city;
		this.user = user;
	}
	public int getAddid() {
		return addid;
	}
	public void setAddid(int addid) {
		this.addid = addid;
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Address [addid=" + addid + ", street=" + street + ", city=" + city + ", user=" + user + "]";
	}
	
	
}
