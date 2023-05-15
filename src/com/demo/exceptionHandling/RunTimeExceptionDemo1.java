package com.demo.exceptionHandling;

public class RunTimeExceptionDemo1 {

	public static void main(String[] args) {
		
		RunTimeExceptionDemo1 runTimeExceptionDemo1 = new RunTimeExceptionDemo1();
		
		//postive case
		int case1 = runTimeExceptionDemo1.getValue(10, 5);
		System.out.println(case1);
		
		//negative case
		int case2 = runTimeExceptionDemo1.getValue(10, 0);
		System.out.println(case2);

	}
	
	public int getValue(int a, int b) {
		int result = a/b;//exception raised and program terminated abruptly
		return result;
	}

}
