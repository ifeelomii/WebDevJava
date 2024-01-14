package com.demo.model;

import javax.persistence.*;

@Entity
@Table(name="user_tbl")
public class User {
	@Id
	private int uid;
	private String name;
	@OneToOne
	@JoinColumn(name="addid")
	private Address addr;
	
	public User() {
		super();
	}
	
	public User(int uid, String name) {
		super();
		this.uid = uid;
		this.name = name;
	}
	
	public User(int uid, String name, Address addr) {
		super();
		this.uid = uid;
		this.name = name;
		this.addr = addr;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
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
		return "User [uid=" + uid + ", name=" + name + "]";
	}
}
