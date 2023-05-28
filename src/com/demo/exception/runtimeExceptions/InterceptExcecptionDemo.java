
package com.demo.exception.runtimeExceptions;

public class InterceptExcecptionDemo {

	public static void main(String[] args) {
		InterceptExcecptionDemo ie = new InterceptExcecptionDemo();
		int value = ie.getValue(10, 10);
		System.out.println(value);
		
		Employee1 employee1 = new Employee1(1, "Divya", null, null, null);
		String name = ie.getName(employee1);
		System.out.println("Divya");
	}

	public int getValue(int a, int b) {
		int result = 0;
		
		try {
			 result = a / b;
		} catch (ArithmeticException e) {
			throw new RuntimeException("a/b will give infinite value");
		}
		return result; 
		
	}
	
	public String getName(Employee1 employee1) {
		try {
			if (employee1.getName() == null && employee1.getName().equals("") ) {

			} 
		} catch (NullPointerException npe) {
			throw new RuntimeException("getName cannot be null or empty");
		}
		return null;
	}
	

}
