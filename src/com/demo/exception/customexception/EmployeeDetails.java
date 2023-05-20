package com.demo.exception.customexception;

public class EmployeeDetails {
	
	public EmployeeDetails(int id, String employeeName, String panNumber, String deptName) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.panNumber = panNumber;
		this.deptName = deptName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	//numeric only
	private int id;
	
	//alphabetic
	private String employeeName;
	
	//alphanumeric
	private String panNumber;
	
	//alphabetic
	private String deptName;
	
	
	

}
