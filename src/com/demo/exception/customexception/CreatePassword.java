package com.demo.exception.customexception;

public class CreatePassword {
	
	public String getUserName() {
		return userName;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public String getConformPassword() {
		return conformPassword;
	}

	@Override
	public String toString() {
		return "CreatePassword [userName=" + userName + ", newPassword=" + newPassword + ", conformPassword="
				+ conformPassword + "]";
	}

	public CreatePassword(String userName, String newPassword, String conformPassword) {
		super();
		this.userName = userName;
		this.newPassword = newPassword;
		this.conformPassword = conformPassword;
	}

	private String userName;
	
	private String newPassword;
	
	private String conformPassword;

}
