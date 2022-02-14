package com.movie.app.controller;

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
	@DeleteMapping("/deleteBooking/{boookingid}")
	public boolean deleteAccount(@PathVariable int bookingId) {
		Booking b = service.getBookingById(bookingId);
		if(b!= null) {
			service.deleteBookingByID(bookingId);;
			return true;
		}
		else
		{
			return false;
		}
	}
	

	
	}
	
	

