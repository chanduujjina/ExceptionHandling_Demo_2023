package com.demo.exceptionHandling.runtime;

public class Sample {
	
	@Override
	public String toString() {
		return "Sample [id=" + id + ", value=" + value + "]";
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
