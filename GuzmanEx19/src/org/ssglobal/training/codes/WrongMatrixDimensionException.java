package org.ssglobal.training.codes;

public class WrongMatrixDimensionException extends Exception {
	
	private String message = "matrix dimension is not correct";
	
	public WrongMatrixDimensionException() {}
	
	public WrongMatrixDimensionException(String newMessage) {
		message = newMessage;
	}

	public String getMessage() {
		return message;
	}

	public void printStackTrace() {
		System.err.println(message);
	}

}
