package com.demo.exception.runtimeExceptions;

public class Employee1 {
	

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", deptName=" + deptName + ", section=" + section + ", email="
				+ email + "]";
	}

	private int id;
	private String name;
	private String deptName;
	private String section;
	private String email;

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
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Employee1(int id, String name, String deptName, String section, String email) {
		super();
		this.id = id;
		this.name = name;
		this.deptName = deptName;
		this.section = section;
		this.email = email;
	}

	

}
