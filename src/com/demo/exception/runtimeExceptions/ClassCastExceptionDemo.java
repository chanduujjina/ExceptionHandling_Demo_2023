package com.demo.exception.runtimeExceptions;

public class ClassCastExceptionDemo {

	public static void main(String[] args) {
		
		ClassCastExceptionDemo classCastExceptionDemo = new ClassCastExceptionDemo();
            Sample1 sample1= (Sample1)classCastExceptionDemo.getInstance();
            System.out.println(sample1);
           
            Employee1 employee1= (Employee1)classCastExceptionDemo.getInstance();
            System.out.println(employee1);
	}

	public Object getInstance() {
		return new Sample1(1,"diabeticSample");
		
		
	}

}
