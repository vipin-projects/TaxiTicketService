package com.serrala.taxiticketservice.exception;

//Generated this class for enhancement purpose if Car needs to be added
public class OutOfSeatCapacityException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String message;
	
	public OutOfSeatCapacityException(String message) {
		super(message);
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}
