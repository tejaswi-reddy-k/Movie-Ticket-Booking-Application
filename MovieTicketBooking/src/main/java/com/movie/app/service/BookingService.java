package com.movie.app.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.movie.app.entity.Booking;
import com.movie.app.entity.Ticket;
import com.movie.app.exceptions.BookingNotFoundException;
import com.movie.app.repository.IBookingRepository;
import com.movie.app.repository.ITicketRepository;

@Service
public class BookingService implements IBookingService {
	
	@Autowired
	IBookingRepository bookingRepository;
	
	@Autowired
	ITicketRepository ticketRepository;
	
	@Override
	public List<Booking> viewBookingList(){
		List<Booking> list = (List<Booking>) bookingRepository.findAll();
	     return list;		
	}
	
	@Override
	 public boolean deleteBookingByID(int bookingid) {
		bookingRepository.deleteById(bookingid);
		return true;
	}
	

	@Override
	public Booking cancelBooking(int bookingid) throws BookingNotFoundException{
		Optional<Booking> bookingoptional = bookingRepository.findById(bookingid);
		if (!bookingoptional.isPresent())
			throw new BookingNotFoundException("Booking couldn't take place");
		bookingRepository.deleteById(bookingid);
		return cancelBooking(bookingid);		
	}

	
	@Override
	public boolean checkBookingById(int bookingid) {
		return bookingRepository.existsById(bookingid);
	}
	
	/*
	@Override
	public Event searchEvent(int eventid) throws EventNotFoundException{
		
	}*/
	
	@Override
	public Booking addBooking(Booking booking)
	{
		return bookingRepository.save(booking);
	}
	
	
	@Override
	public String updateBooking(Booking booking) throws BookingNotFoundException{
		Optional<Booking> bookingoptional = bookingRepository.findById(booking.getBookingId());
		if (!bookingoptional.isPresent())
			throw new BookingNotFoundException("Booking couldn't take place");
		Booking getBooking = bookingoptional.get();
		getBooking.setBookingId(booking.getBookingId());
		getBooking.setBusinessId(booking.getBusinessId());
		getBooking.setBookingTime(booking.getBookingTime());
		getBooking.setBookingDate(booking.getBookingDate());
		getBooking.setTransactionId(booking.getTransactionId());
		getBooking.setBookingTime(booking.getBookingTime());
		getBooking.setTotalCost(booking.getTotalCost());
		getBooking.setNoOfSeats(booking.getNoOfSeats());
		bookingRepository.save(getBooking);
		return "Booking updated successfully";
	}
/*	
	@Override
	public double calculateTotalCost(double totalcost)
	{

	}

*/
	
	@Override
	public List<Ticket> viewTicketsByBookingId(int bookingid) throws BookingNotFoundException {
		Optional<Booking> bookingoptional = bookingRepository.findById(bookingid);
		if (!bookingoptional.isPresent())
			throw new BookingNotFoundException("Booking not found");
		return bookingoptional.get().getListOfticket();
	}

	@Override
	public Booking getBookingById(int bookingid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> getBookingsByTransactionId(int transactionid) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Booking> viewBookingByDate(LocalDate date1, LocalDate date2) throws BookingNotFoundException {
		return bookingRepository.findByDate(date1, date2);
	}
}
