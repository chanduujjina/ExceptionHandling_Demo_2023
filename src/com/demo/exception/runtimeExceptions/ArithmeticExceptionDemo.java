package com.demo.exception.runtimeExceptions;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		
		ArithmeticExceptionDemo arithmeticExceptionDemo = new ArithmeticExceptionDemo();
		int value = arithmeticExceptionDemo.getValue(10,5);
		System.out.println(value);
		
		int value1 = arithmeticExceptionDemo.getValue(0,0);
		System.out.println(value1);
	}

	public int getValue(int a,int b) {
		int result = a/b;
		return result;
	}

}

