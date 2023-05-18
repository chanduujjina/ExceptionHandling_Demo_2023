package com.demo.exception.runtime;

public class ThrowDemo {
	
	public static void main(String[] args) throws Exception {
		ThrowDemo throwDemo = new ThrowDemo();
		Employee employee = new Employee(1, "chandu", "male", "it", Double.valueOf(0));
		throwDemo.validateEmployeeData(employee);
	}
	
	public void validateEmployeeData(Employee employee) throws Exception{
		if(employee.getSalary()<=0) {
			throw new Exception("salary cannot be zero or negative");
		}
		if(employee.getName()== null && employee.getName() =="") {
			throw new Exception("name cannot be empty or null");
		}
	}

}
