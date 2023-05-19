package com.demo.exception.compiletime;

public class CompileTimeExceptionDemo2 {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		//case1
		CompileTimeExceptionDemo2 exceptionDemo1 = new CompileTimeExceptionDemo2();
		Class cls = exceptionDemo1.getClassInfo("com.demo.exception.compiletime.Sample");//method call
		Sample sample= null;
		try {
			//case
			sample =(Sample)cls.newInstance();
			System.out.println(sample);
			
			//
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Class getClassInfo(String className) throws ClassNotFoundException {//method difinition
		Class<?> cls = Class.forName(className);
		return cls;
	}

}
