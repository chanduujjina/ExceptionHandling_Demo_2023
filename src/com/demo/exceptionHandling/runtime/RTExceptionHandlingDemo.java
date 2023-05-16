package com.demo.exceptionHandling.runtime;

public class RTExceptionHandlingDemo {
	
	public static void main(String[] args) {
		
		handleException();
		notHandleException();
		
	}

	private static void notHandleException() {
		int result = 1/0;
		System.out.println("aftter the statement notHandleException");
		
	}

	private  static void handleException() {
		try {
			int result = 1/0;
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		System.out.println("aftter the statement in handleException:");
	}

}
