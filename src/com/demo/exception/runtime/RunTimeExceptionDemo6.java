package com.demo.exception.runtime;

public class RunTimeExceptionDemo6 {
	
	public static void main(String[] args) {
		
		Integer numberArray[] = {1,2,3,4,5};
		String val=null;
		
		try {
			Integer value = numberArray[1];
			System.out.println(value);
			
			try {
				int result = 1/0;
				
			}catch(ArithmeticException aex) {
				aex.printStackTrace();
			}
			
			try {
				if(val.equals("test")) {
					System.out.println("inside if loop");
				}
				
			}catch(NullPointerException aex) {
				aex.printStackTrace();
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
		}catch(ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}
		
		try {
			
		}catch(Exception ex) {
			
		}
		System.out.println("rest of the code ");
		
	}
	
	
}
