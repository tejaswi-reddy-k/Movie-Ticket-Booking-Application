package com.movie.app.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.movie.app.entity.Booking;
import com.movie.app.exceptions.BookingNotFoundException;

public interface CustomBookingRepository {
	
	public Booking addBooking(Booking booking);
	public Booking updateBooking(Booking booking) throws BookingNotFoundException;
	public Booking cancelBooking(int bookingid) throws BookingNotFoundException;
	/*public List<Booking> showAllBookingsList(int businessid);
	//public List<Booking> showAllBookings(int movieid);
	//public List<Booking> showAllBookings(int eventid);
	public List<Booking> showAllBookings(LocalDate bookingdate);
	public List<Booking> showAllBookings(LocalTime bookingtime);
	public double calculateTotalCost(int bookingid);*/
	
	//above are for services

}
