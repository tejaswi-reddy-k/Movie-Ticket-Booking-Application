package com.movie.app.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.movie.app.entity.Booking;
import com.movie.app.entity.Event;
import com.movie.app.exceptions.BookingNotFoundException;

public interface CustomBookingRepository {
	
	//public double calculateTotalCost(double totalcost);
	
	public List<Booking> getBookingsByTransactionId(int transactionId);

}
