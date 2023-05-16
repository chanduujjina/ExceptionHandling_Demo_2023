package com.demo.exceptionHandling.runtime;

import java.util.ArrayList;
import java.util.List;

public class RTExceptionHandlingDemo2 {
	
	private static String value = "chandu 129 java 246 react";
	
	
	
	public static void main(String[] args) {
		
		//convert String to String array by using split method
		String[] valueArray = value.split(" ");
		List<Integer> numberList = new ArrayList();
		List<String> nonnumberList = new ArrayList();
		for(String val: valueArray) {
			
			try {
			int num = Integer.parseInt(val);
			System.out.println(num);
			numberList.add(num);
		   }catch (NumberFormatException ex) {
			System.out.println(val);
			nonnumberList.add(val);
		}
		}
		System.out.println(numberList);
		System.out.println(nonnumberList);
	}
	


	

}
