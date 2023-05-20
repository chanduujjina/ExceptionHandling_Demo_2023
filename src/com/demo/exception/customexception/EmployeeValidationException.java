package com.demo.exception.customexception;

public class EmployeeValidationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmployeeValidationException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeValidationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public EmployeeValidationException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public EmployeeValidationException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public EmployeeValidationException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
