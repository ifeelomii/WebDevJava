package com.demo.model;

import javax.persistence.*;

@Entity
@Table(name="user_tbl")
public class User {
	@Id
	@Column(name="uid",nullable=false)
	private int uid;
	
	@Column(name="uname",nullable=false)
	private String uname;
	
	@Column(name="sal")
	private double sal;

	public User() {
		super();
	}

	public User(int uid, String uname, double sal) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.sal = sal;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", sal=" + sal + "]";
	}
	
	
	
}
