package com.demo.exception.customexception;

public class CustomExceptionDemo3 {

	public static void main(String[] args) throws EmployeeValidationException {
		
		CustomExceptionDemo3 customExceptionDemo = new CustomExceptionDemo3();
        EmployeeDetails employeeDetails = new EmployeeDetails(2, "test", "AEWPU4902R", "it");
        customExceptionDemo.validateEmployee(employeeDetails);
        System.out.println("employee data is saved in db for the employee :"+employeeDetails.getEmployeeName());

	}
	

	private  void validateEmployee(EmployeeDetails employeeDetails) throws EmployeeValidationException {
		
		if(!String.valueOf(employeeDetails.getId()).matches("^[1-9]+$")) {
			throw new EmployeeValidationException("employee id can be numeric and positive only");
		}
		
		if(!employeeDetails.getEmployeeName().matches("[a-zA-Z]+")) {
			throw new EmployeeValidationException("employee name can be alphabetical only");
		}
		
		if(!employeeDetails.getPanNumber().matches("[a-zA-Z0-9]+")) {
			throw new EmployeeValidationException("pan number can be alphanumeric only");
		}
		
		if(!employeeDetails.getDeptName().matches("[a-zA-Z]+")) {
			throw new EmployeeValidationException("department name can be alphabetical only");
		}
		
		
	}
	
	

}
