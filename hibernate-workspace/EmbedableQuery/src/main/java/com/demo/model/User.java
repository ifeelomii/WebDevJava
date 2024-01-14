package com.demo.model;

import javax.persistence.*;

@Entity
@Table(name="user_tbl")
public class User {
	@Id
	private int id;
	private String name;
	@Embedded
	private Address addr;
	
	public User() {
		super();
	}

	public User(int id, String name, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}
	
	
}
