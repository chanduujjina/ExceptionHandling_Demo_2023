package com.demo.exception.runtimeExceptions;

public class ArrayStoreExceptionDemo {

	public static void main(String[] args) {
		
		

		/*
		 * Number[] num = new Double[9]; 
		 * num[0] = 2.0; 
		 * System.out.println(num);
		 */
		
		
		Number[] num1 = new Double[9];
		num1[0] = new Integer(44);
		

	}

}
