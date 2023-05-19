package com.demo.exception.compiletime;

public class CompileTimeExceptionDemo1 {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		//case1
		CompileTimeExceptionDemo1 exceptionDemo1 = new CompileTimeExceptionDemo1();
		exceptionDemo1.getClassInfo("com.demo.exception.compiletime.Activity");//method call
		
		
	}
	
	public Class getClassInfo(String className) throws ClassNotFoundException {//method difinition
		Class<?> cls = Class.forName(className);
		return cls;
	}

}
