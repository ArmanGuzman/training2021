package org.ssglobal.training.codes;

public class InvalidSizeException extends Exception {
	
	private String message = "Array size cannot be negative";
	
	public InvalidSizeException() {}
	
	public InvalidSizeException(String newMessage) {
		message = newMessage;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void printStackTrace() {
		System.err.println(message);
	}
	
}
