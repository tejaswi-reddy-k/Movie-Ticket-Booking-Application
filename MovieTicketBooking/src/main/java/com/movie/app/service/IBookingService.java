package com.movie.app.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.movie.app.entity.Booking;
import com.movie.app.entity.Event;
import com.movie.app.entity.Ticket;
import com.movie.app.exceptions.BookingNotFoundException;
import com.movie.app.exceptions.EventNotFoundException;

@Service
public interface IBookingService {
	
	public Booking addBooking(Booking booking);
	public String updateBooking(Booking booking) throws BookingNotFoundException;
	public Booking cancelBooking(int bookingid) throws BookingNotFoundException;
	
	/*public List<Booking> showAllBookingsList(int businessid);
	public List<Booking> showAllBookings(int movieid);
	public List<Booking> showAllBookings(int eventid);*/
	
	/*public List<Booking> showAllBookings(LocalDate bookingdate);
	public List<Booking> showAllBookings(LocalTime bookingtime);*/
	
	//public double calculateTotalCost(double totalcost);

	
	public Booking getBookingById(int bookingid);
	public List<Booking> viewBookingList();
	public void  deleteBookingByID(int bookingid);
	public boolean checkBookingById(int bookingid);
	
	public List<Ticket> viewTicketsByBookingId(int bookingid) throws BookingNotFoundException;
	//public boolean addTicket(int bookingid,int ticketid);


}

