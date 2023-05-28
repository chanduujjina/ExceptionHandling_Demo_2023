package com.demo.exception.runtimeExceptions;

public class NumberformatExceptionDemo {

	public static void main(String[] args) {
		NumberformatExceptionDemo numberformatExceptionDemo = new NumberformatExceptionDemo();
		Integer numericValue = numberformatExceptionDemo.getNumericValue("100");
		System.out.println(numericValue);
		Integer numericValue1 = numberformatExceptionDemo.getNumericValue("demo");
		System.out.println(numericValue1);
	}

	public Integer getNumericValue(String value) {
		return Integer.parseInt(value);
		
		
	}

}
