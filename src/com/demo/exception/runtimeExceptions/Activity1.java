package com.demo.exception.runtimeExceptions;

public class Activity1 {
	
	private int id;
	
	private String name;
	
	private String type;
	
	private String description;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Activity1(int id, String name, String type, String description) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Activity1 [id=" + id + ", name=" + name + ", type=" + type + ", description=" + description + "]";
	}

	
	
}
