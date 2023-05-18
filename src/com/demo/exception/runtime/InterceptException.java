package com.demo.exception.runtime;

public class InterceptException {

	public static void main(String[] args) {
		
		InterceptException interceptException = new InterceptException();
		
		int compute = interceptException.compute(1, 0);
		System.out.println(compute);

	}

	
	public int compute(int a,int b) {
		int result= 0;
		try {
			 result = a / b;
		} catch (ArithmeticException e) {
			throw new RuntimeException("1/0 will give infinite value");
		}
		return result;
	}
}
