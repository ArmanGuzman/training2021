package org.ssglobal.training.codes;

public class ElementCharException extends Exception {
	
	private String message = "Element cannot be a character";
	
	public ElementCharException() {}
	
	public ElementCharException(String newMessage) {
		message = newMessage;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void printStackTrace() {
		System.err.println(message);
	}

}
