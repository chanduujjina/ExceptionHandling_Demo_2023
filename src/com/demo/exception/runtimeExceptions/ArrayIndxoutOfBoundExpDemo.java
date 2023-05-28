package com.demo.exception.runtimeExceptions;


public class ArrayIndxoutOfBoundExpDemo {

	
	private static Integer numberArray[] = new Integer[3];
	
	static {
		numberArray[0] =1;
		numberArray[1] =2;
		numberArray[2] =3;
	}
	public static void main(String[] args) {

		ArrayIndxoutOfBoundExpDemo arrayIndxoutOfBoundExpDemo = new ArrayIndxoutOfBoundExpDemo();
		Integer getarrayValue = arrayIndxoutOfBoundExpDemo.getarrayValue(0);
		System.out.println(getarrayValue);

		
		Integer getarrayValue1 = arrayIndxoutOfBoundExpDemo.getarrayValue(8);
		System.out.println(getarrayValue1);
	}
	public Integer getarrayValue(int index) {
		return numberArray[index];
		
	}

}
