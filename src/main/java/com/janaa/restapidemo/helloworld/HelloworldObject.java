package com.janaa.restapidemo.helloworld;

public class HelloworldObject {

	private int id;
	private String name;

	public HelloworldObject() {

	}

	public HelloworldObject(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

}
