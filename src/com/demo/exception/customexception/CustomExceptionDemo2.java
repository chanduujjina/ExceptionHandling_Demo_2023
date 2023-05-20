package com.demo.exception.customexception;

import java.util.ArrayList;
import java.util.List;

public class CustomExceptionDemo2 {

	public static void main(String[] args) {
		
		CustomExceptionDemo2 customExceptionDemo = new CustomExceptionDemo2();
        EmployeeDetails employeeDetails = new EmployeeDetails(0, "", "", "");
        List<ErrorDetails> errDetailsList = customExceptionDemo.validateEmployee(employeeDetails);
        if(errDetailsList.isEmpty()) {
        	System.out.println("Employee data saved in db for the user:"+employeeDetails.getEmployeeName());
        }
        
        else {
         System.out.println(errDetailsList);
        }
        

	}
	

	private  List<ErrorDetails> validateEmployee(EmployeeDetails employeeDetails) {
		List<ErrorDetails> errorDetailList = new ArrayList<>();
		if(employeeDetails.getId()<= 0) {
			ErrorDetails details = new ErrorDetails("id","emp id cannot be zero or negative");
			errorDetailList.add(details);
		}
		
		if(employeeDetails.getDeptName() == null || employeeDetails.getDeptName().equals("")) {
			ErrorDetails details = new ErrorDetails("departmentName","department name cannot be null or empty");
			errorDetailList.add(details);
		}
		
		if(employeeDetails.getEmployeeName() == null || employeeDetails.getEmployeeName().equals("")) {
			ErrorDetails details = new ErrorDetails("employeeName","employee name cannot be null or empty");
			errorDetailList.add(details);
		}
		
		if(employeeDetails.getPanNumber() == null || employeeDetails.getPanNumber().equals("")) {
			ErrorDetails details = new ErrorDetails("panNumber","pan number cannot be null or empty");
			errorDetailList.add(details);
		}
		return errorDetailList;
	}
	
	

}
