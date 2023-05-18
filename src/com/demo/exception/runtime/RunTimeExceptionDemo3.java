package com.demo.exception.runtime;

public class RunTimeExceptionDemo3 {

	public static void main(String[] args) {
		
		RunTimeExceptionDemo3 runTimeExceptionDemo3 = new RunTimeExceptionDemo3();
		
		//case 1
		Activity case1 = (Activity)runTimeExceptionDemo3.getInstance();
		System.out.println(case1);
		
		//case 2
		Sample case2 = (Sample)runTimeExceptionDemo3.getInstance();
		System.out.println(case2);
	

	}
	
	public Object getInstance() {
		return new Activity(1,"test");
	}

}
