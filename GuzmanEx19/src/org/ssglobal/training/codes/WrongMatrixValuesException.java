package org.ssglobal.training.codes;

public class WrongMatrixValuesException extends Exception {
	
	private String message = "file is not convertible to integers";
	
	public WrongMatrixValuesException() {}
	
	public WrongMatrixValuesException(String newMessage) {
		message = newMessage;
	}

	public String getMessage() {
		return message;
	}

	public void printStackTrace() {
		System.err.println(message);
	}

}
