package com.demo.exceptionHandling.runtime;

public class RunTimeExceptionDemo4 {
	
	private static Integer numberArray[] = new Integer[5];
	
	static {
		numberArray[0] =10;
		numberArray[1] =20;
		numberArray[2] =30;
		numberArray[3] =40;
		numberArray[4] =50;
	}

	public static void main(String[] args) {
		
		//case 1
		int case1 = RunTimeExceptionDemo4.getValueFromArray(0);
		System.out.println(case1);
		
		//case 2
		int case2 = RunTimeExceptionDemo4.getValueFromArray(6);
		System.out.println(case2);

	}
	
	public static int getValueFromArray(int index) {
		return numberArray[index];
	}

}
