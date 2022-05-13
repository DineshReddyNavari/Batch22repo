package com.zensar.olxadvertise.exception;

//@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class InvalidAdvertiseIdException extends Exception {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public InvalidAdvertiseIdException(String message) {
		super();
		this.message = message;
	}
	public String InvalidAdvertiseIdException(String message) {
		return message;
	}
	
	

}
