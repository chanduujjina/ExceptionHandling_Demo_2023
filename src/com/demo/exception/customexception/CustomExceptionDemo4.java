package com.demo.exception.customexception;

public class CustomExceptionDemo4 {

	public static void main(String[] args) throws EmployeeValidationException, PasswordValidationException {
		
		CustomExceptionDemo4 customExceptionDemo = new CustomExceptionDemo4();
        
		CreatePassword createPassword = new CreatePassword("chandu", "Chandu@test1", "Chandu@test1");
		customExceptionDemo.validatePasswordDetails(createPassword);
		System.out.println("Password created successfully");

	}

	private  void validatePasswordDetails(CreatePassword createPassword) throws PasswordValidationException {
		
		//new password and conform password should match
		if(!(createPassword.getNewPassword() != null && createPassword.getConformPassword() != null && createPassword.getNewPassword().equals(createPassword.getConformPassword()))) {
			throw new PasswordValidationException("new Password and conform password not meet");
		}
		 String regex = "^(?=.*[0-9])"
                 + "(?=.*[a-z])(?=.*[A-Z])"
                 + "(?=.*[@#$%^&+=])"
                 + "(?=\\S+$).{8,20}$";
		
		if(!createPassword.getNewPassword().matches(regex)) {
			throw new PasswordValidationException("Password complexity does not match");
		}
		
	} 
	

	
	
	

}
