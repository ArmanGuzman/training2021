package org.ssglobal.training.codes;

public class ElementStringException extends Exception {

	private String message = "Element cannot be a string";
	
	public ElementStringException() {}
	
	public ElementStringException(String newMessage) {
		message = newMessage;
	}
	
	public String getMessage() {
		return message;
	}

	public void printStackTrace() {
		System.err.println(message);
	}
	
}
