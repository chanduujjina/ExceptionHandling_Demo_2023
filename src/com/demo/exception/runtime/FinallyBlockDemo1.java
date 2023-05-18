package com.demo.exception.runtime;

public class FinallyBlockDemo1 {
	
public static void main(String[] args) {
		
		//case 1
		int value = compute(1,2);
		System.out.println(value);
		
		//case 1
		int value1 = compute(1,0);
	}

	private static int compute(int num1, int num2) {
		int result =0;
		try {
			result = num1/num2;
			System.out.println("inside try block");
			
		}catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("inside catch block");
			System.exit(0);
		}
		finally {
			System.out.println("inside finally block");
		}
		return result;
	}
}
