  package com.demo.exception.runtimeExceptions;

public class NullPointerExceptionDemo {

	public static void main(String[] args) {
		NullPointerExceptionDemo npe = new NullPointerExceptionDemo();
		boolean string = npe.getString("Test");
		System.out.println(string);
		
		boolean string1 = npe.getString("Demo");
		System.out.println(string1);
		
		boolean string2 = npe.getString(null);
		System.out.println(string2);
	}

	public boolean getString(String value) {
	return	value.equals("Test");
				
	}

}
