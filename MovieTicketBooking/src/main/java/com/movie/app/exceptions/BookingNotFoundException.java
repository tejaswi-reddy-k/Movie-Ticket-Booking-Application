package com.movie.app.exceptions;

public class BookingNotFoundException extends Exception {
	
	private String message;

	public BookingNotFoundException(String message) {
		super(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
