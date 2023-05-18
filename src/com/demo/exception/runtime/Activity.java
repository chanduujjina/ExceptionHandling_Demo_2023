package com.demo.exception.runtime;

public class Activity {
	
	@Override
	public String toString() {
		return "Activity [id=" + id + ", value=" + value + "]";
	}

	public Activity(int id, String value) {
		super();
		this.id = id;
		this.value = value;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	private int id;
	
	private String value;

}
