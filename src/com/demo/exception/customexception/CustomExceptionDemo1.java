package com.demo.exception.customexception;

public class CustomExceptionDemo1 {

	public static void main(String[] args) throws EmployeeValidationException {
		
		CustomExceptionDemo1 customExceptionDemo = new CustomExceptionDemo1();
        EmployeeDetails employeeDetails = new EmployeeDetails(1, "", "AEWPU4902R", "it");
        customExceptionDemo.validateEmployee(employeeDetails);
        //save data into database;
        System.out.println("Employee data saved in db for the user:"+employeeDetails.getEmployeeName());

	}

	private  void validateEmployee(EmployeeDetails employeeDetails) throws EmployeeValidationException {
		
		if(employeeDetails.getId()<= 0) {
			throw new EmployeeValidationException("emp id cannot be zero or negative");
		}
		
		if(employeeDetails.getDeptName() == null || employeeDetails.getDeptName().equals("")) {
			throw new EmployeeValidationException("department name cannot be null or empty");
		}
		
		if(employeeDetails.getEmployeeName() == null || employeeDetails.getEmployeeName().equals("")) {
			throw new EmployeeValidationException("employee name cannot be null or empty");
		}
		
		if(employeeDetails.getPanNumber() == null || employeeDetails.getPanNumber().equals("")) {
			throw new EmployeeValidationException("pan number cannot be null or empty");
		}
	}
	
	

}
