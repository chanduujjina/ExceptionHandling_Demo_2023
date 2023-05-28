package com.demo.exception.runtimeExceptions;

public class FinallyDemo {
	public static void main(String[] args) {
		FinallyDemo finallyDemo = new FinallyDemo();
		Employee1 employee1 = new Employee1(1, "Divya", "", "A", "divyamanchala@hmail.com");
		finallyDemo.getDeptName(employee1);
		System.out.println("save employee details");
		
	}

	public void getDeptName(Employee1 employee1) {
		try {
			if (employee1.getDeptName() == null || employee1.getDeptName().equals("")){
              System.out.println("Inside try block");
             
			} 
		} catch (Exception e) {
			System.out.println("inside catch block");
		
			
		}
		finally {
			System.out.println("inside finally block");
		}
	}

}
