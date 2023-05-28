package com.demo.exception.runtimeExceptions;

public class IllegalArgumentExceptionDemo {

	public static void main(String[] args) throws Exception {

		IllegalArgumentExceptionDemo iae = new IllegalArgumentExceptionDemo();
		Employee1 employee1 = new Employee1(0, "Divya", "IT", "A", "divya88@gmail.com");
		iae.getId(employee1);
		System.out.println("save employee data");

	}

	private void getId(Employee1 employee1) throws Exception {
		if(employee1.getId()<=0) {
			throw new Exception("id cannot be zero or negative");
		}
	
		
	}

}

