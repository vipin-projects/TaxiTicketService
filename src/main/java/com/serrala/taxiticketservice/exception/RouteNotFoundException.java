package com.serrala.taxiticketservice.exception;

/**
 * This exception will be generated if desired route does not exist in the 
 * system.
 * @author Vipin
 *
 */
public class RouteNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String message;
	
	public RouteNotFoundException(String message) {
		super(message);
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}
