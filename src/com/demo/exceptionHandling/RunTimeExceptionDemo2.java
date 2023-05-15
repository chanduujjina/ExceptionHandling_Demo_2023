package com.demo.exceptionHandling;

public class RunTimeExceptionDemo2 {

	public static void main(String[] args) {
		
		RunTimeExceptionDemo2 runTimeExceptionDemo2 = new RunTimeExceptionDemo2();
		
		//case 1 positive
		
		boolean case1 = runTimeExceptionDemo2.compareValue("test");
		System.out.println(case1);
		
		//case 2 negative
		   boolean case2 = runTimeExceptionDemo2.compareValue("test1");
		   System.out.println(case2);
		   
		   //case 3
		   boolean case3 = runTimeExceptionDemo2.compareValue(null);
		   System.out.println(case3);

	}
	
	public boolean compareValue(String value) {
		return value.equals("test");
	}

}
