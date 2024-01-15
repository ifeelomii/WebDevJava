package com.demo.model;

public class User {
	private int id;
	private String name;
	
	public User() {
		super();
		System.out.println("In Default Constructor");
	}

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("In Parameterised Constructor");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("In setId");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("In setName");
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
		
}
