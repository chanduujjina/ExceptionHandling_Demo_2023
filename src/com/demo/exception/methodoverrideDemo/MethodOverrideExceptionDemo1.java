package com.demo.exception.methodoverrideDemo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MethodOverrideExceptionDemo1 {

}

class Parent {
	
	public void m1() {
		System.out.println("Inside Parent m1 method:");
	}
	
	public void m2() {
		System.out.println("Inside Parent m2 method:");
	}
	
	public void m3() throws IOException{
		System.out.println("Inside Parent m3 method:");
	}
	
	
	
	public void m4() throws IOException{
		System.out.println("Inside Parent m4 method:");
	}
	
	public void m5() throws IOException{
		System.out.println("Inside Parent m5 method:");
	}
	
}

class Child extends Parent{
	
	
	/*
	 * @Override public void m1() throws IOException{
	 * System.out.println("Inside Child m1 method:"); }
	 */
	 
	
	@Override
	public void m2() throws RuntimeException{
		System.out.println("Inside Child m2 method:");
	}
	
	@Override
	public void m3() throws FileNotFoundException{
		System.out.println("Inside Child m3 method:");
	}
	
	/*
	 * public void m4() throws Exception{
	 * System.out.println("Inside Child m4 method:"); }
	 */
	
	public void m5() {
		System.out.println("Inside Child m5 method:");
	}
	
}