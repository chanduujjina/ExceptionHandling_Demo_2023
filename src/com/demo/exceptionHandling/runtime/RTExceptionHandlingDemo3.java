package com.demo.exceptionHandling.runtime;

public class RTExceptionHandlingDemo3 {
	
	private static String value ="test";
	public static void main(String[] args) {
		
		try {
		value.toString();
		int result = 1/0;
		}catch(ArithmeticException  | NullPointerException gex) {
			gex.printStackTrace();
		}
		/*
		 * catch(NullPointerException nex) { nex.printStackTrace(); }
		 */
		System.out.println("rest of the code");
		
		
	}
	


	

}
