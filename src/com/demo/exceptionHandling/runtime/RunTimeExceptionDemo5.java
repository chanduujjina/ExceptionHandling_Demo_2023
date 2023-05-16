package com.demo.exceptionHandling.runtime;

public class RunTimeExceptionDemo5 {
	
	public static void main(String[] args) {
		RunTimeExceptionDemo5 exceptionDemo5 = new RunTimeExceptionDemo5();
		//case 1
		int case1 = exceptionDemo5.getNumericValue("2");
		System.out.println(case1);
		
		
		// case 2
		int case2 = exceptionDemo5.getNumericValue("test");
		System.out.println(case2);
	}
	
	public int getNumericValue(String value) {
		return Integer.parseInt(value);
	}
}
