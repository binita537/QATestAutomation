package com.orangehrm.exceptions;

@SuppressWarnings("serial")
public class AbstractException extends RuntimeException {

	public AbstractException(String errorMessage) {
		// Throwlable --Exception---RuntimeException class   
		super(errorMessage);
	}
	
	public AbstractException(String errorMessage,Throwable cause) {
		super(errorMessage,cause);
	}
	

}
