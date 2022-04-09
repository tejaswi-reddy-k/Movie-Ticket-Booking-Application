package com.movie.app.exceptions;

public class TheatreExistsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8308551481609463479L;
	private String message;

	public TheatreExistsException(String message) {
		super(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
