package org.ssglobal.training.codes;

public class LetterSizeException extends Exception {
	
	private String message = "Invalid Size";
	
	public LetterSizeException() {}
	
	public LetterSizeException(String newMessage) {
		message = newMessage;
	}

	public String getMessage() {
		return message;
	}

	public void printStackTrace() {
		System.err.println(message);
	}

}
