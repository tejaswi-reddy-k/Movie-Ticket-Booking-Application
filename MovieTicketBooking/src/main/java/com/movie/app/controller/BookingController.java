package com.movie.app.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.app.entity.Booking;
import com.movie.app.entity.Movie;
import com.movie.app.entity.Theatre;
import com.movie.app.entity.Ticket;
import com.movie.app.exceptions.BookingNotFoundException;
import com.movie.app.exceptions.MovieNotFoundException;
import com.movie.app.service.IBookingService;

@RestController
@RequestMapping("/Booking")
public class BookingController {
	@Autowired
	private IBookingService service; 
	
	@GetMapping("/viewallbookings")
		public ResponseEntity<List<Booking>> viewBookingList(){
			List<Booking> response = service.viewBookingList();
			
		     return new ResponseEntity<List<Booking>>(response, HttpStatus.OK);
	}
	@GetMapping("/getbooking/{bookingid}")
	public Booking getBookingById(int bookingid) {
	return service.getBookingById(bookingid);
	}
	@GetMapping("/checkbooking/{bookingid}")
	public boolean checkBookingById(int bookingid) {
		return service.checkBookingById(bookingid);
	}
	@PostMapping("/updatebooking")
	public ResponseEntity<String> updateMovie(@RequestBody Booking booking) throws BookingNotFoundException {
		String response = service.updateBooking(booking);
		return new ResponseEntity<String>(response, HttpStatus.CREATED);
	}
	@PostMapping("/checkbybookingid/{bookingid}")
	public boolean checkBookingById1(@PathVariable int bookingid) {
		Booking b=service.getBookingById(bookingid);
		if(b.getBookingId()==bookingid) 
		{
			 
			 return true;
		}else {
			return false;
		}
		
	}
	@PostMapping("/addbooking")
	public Booking addMovie(@RequestBody Booking booking) {
		Booking response = service.addBooking(booking);
		return service.addBooking(booking);
	}
	
	
	@DeleteMapping("/deletebooking/{bookingid}")
	public ResponseEntity<String> cancelBooking(@PathVariable("bookingid") Integer bookingid) throws BookingNotFoundException {
		Booking response = service.cancelBooking(bookingid);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	@GetMapping("/viewticketsbybookingid/{bookingid}")
	public ResponseEntity<List<Ticket>> viewTicketsByBookingId(@PathVariable("bookingid") Integer bookingId)
			throws BookingNotFoundException {
		List<Ticket> response = service.viewTicketsByBookingId(bookingId);
		return new ResponseEntity<List<Ticket>>(response, HttpStatus.OK);
	}

	@GetMapping("/getbookingbytransactionid/{transactionid}")
	public ResponseEntity<String> getBookingsByTransactionId(@PathVariable("transactionId") int transactionid) throws BookingNotFoundException {
		List<Booking> response = service.getBookingsByTransactionId(transactionid);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	@GetMapping("/viewbookingsbydate/{date1}/{date2}")
	public ResponseEntity<List<Booking>> viewMoviesByGenre(@PathVariable("date1") LocalDate date1, @PathVariable("date1") LocalDate date2)
			throws BookingNotFoundException {
		List<Booking> response = service.viewBookingByDate(date1, date2);
		return new ResponseEntity<List<Booking>>(response, HttpStatus.OK);
	}

	
	}
	
	

