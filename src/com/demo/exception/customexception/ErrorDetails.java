package com.demo.exception.customexception;

public class ErrorDetails {
	
	@Override
	public String toString() {
		return "ErrorDetails [errorType=" + errorType + ", errorMessage=" + errorMessage + "]";
	}

	public ErrorDetails(String errorType, String errorMessage) {
		super();
		this.errorType = errorType;
		this.errorMessage = errorMessage;
	}

	private String errorType;
	
	private String errorMessage;

}
