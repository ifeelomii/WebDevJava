package com.demo.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="add_tbl")
public class Address {
	@Id
	private int addid;
	private String street;
	private String city;
	@OneToMany(mappedBy="addr",cascade = CascadeType.ALL )
	private List<User> listUser;
	
	public Address() {
		super();
	}
	public Address(int addid, String street, String city) {
		super();
		this.addid = addid;
		this.street = street;
		this.city = city;
	}
	public Address(int addid, String street, String city, List<User> listUser) {
		super();
		this.addid = addid;
		this.street = street;
		this.city = city;
		this.listUser = listUser;
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
	public List<User> getListUser() {
		return listUser;
	}
	public void setListUser(List<User> listUser) {
		this.listUser = listUser;
	}
	@Override
	public String toString() {
		return "Address [addid=" + addid + ", street=" + street + ", city=" + city + ", user=" + listUser + "]";
	}
	
	
}
