package com.demo.exception.runtimeExceptions;

public class ThrowDemo1 {
	
	public static void main(String[] args) throws Exception {
		ThrowDemo1 throwDemo1 = new ThrowDemo1();
		Employee1 employee1 = new Employee1(1, "Divya", "IT", "A", "divya88@gmail.com");
		throwDemo1.validateEmployeData(employee1);//
		System.out.println("save employee data");
	}

	private  void validateEmployeData(Employee1 employee1) throws Exception {
		//id validation
		if(employee1.getId()<=0) {
			throw new Exception("id cannot be zero or negative");
		}
		//name validation
		if(employee1.getName() ==null || employee1.getName().equals("")) {
			throw new Exception("name cannot be null or empty");
		}
		
		//deptName validation
		if(employee1.getDeptName() ==null || employee1.getDeptName().equals("")) {
			throw new Exception("deptName cannot be null or empty");
		}
		
		//section validation
		if(employee1.getSection() ==null || employee1.getSection().equals("")) {
			throw new Exception("section cannot be null or empty");
		}
		
		//email validation
		if(employee1.getEmail() == null || !(employee1.getEmail().contains("@") && employee1.getEmail().contains(".com") )){
			throw new Exception("email cannot be null or empty and it should contain @ and .com");
		}
		
		
	}
     
}
