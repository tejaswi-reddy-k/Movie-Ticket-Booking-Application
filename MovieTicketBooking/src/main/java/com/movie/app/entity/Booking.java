package com.movie.app.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;

@Entity
public class Booking {
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(int bookingId, int businessId, LocalDate bookingDate, LocalTime bookingTime, int transactionId,
			@Min(value = 500000, message = "Min rage of total booking cost is 500000.00") double totalCost,
			@Min(value = 5000, message = "Min Seats booked is 5000") int noOfSeats, Ticket ticket) {
		super();
		this.bookingId = bookingId;
		this.businessId = businessId;
		this.bookingDate = bookingDate;
		this.bookingTime = bookingTime;
		this.transactionId = transactionId;
		this.totalCost = totalCost;
		this.noOfSeats = noOfSeats;
		this.ticket = ticket;
	}
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private int bookingId;
	//private int movieId;
	//private int eventId;
	private int businessId;	
	private LocalDate bookingDate;
	private LocalTime bookingTime;
	//private Show showRef;	
	private int transactionId;
	@Min(value = (long) 500000.00, message = "Min rage of total booking cost is 500000.00")
	private double totalCost;
	//private List<Seat> seatList;
	@Min(value = 5000, message = "Min Seats booked is 5000")
	private int noOfSeats;
	@Embedded
	private Ticket ticket;
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	/*public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}*/
	public int getBusinessId() {
		return businessId;
	}
	public void setBusinessId(int businessId) {
		this.businessId = businessId;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	
	public LocalTime getBookingTime() {
		return bookingTime;
	}
	public void setBookingTime(LocalTime bookingTime) {
		this.bookingTime = bookingTime;
	}
	/*public Show getShowRef() {
		return showRef;
	}
	public void setShowRef(Show showRef) {
		this.showRef = showRef;
	}*/
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
		
		
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	/*public List<Seat> getSeatList() {
		return seatList;
	}
	public void setSeatList(List<Seat> seatList) {
		this.seatList = seatList;
	}*/
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", businessId=" + businessId + ", bookingDate=" + bookingDate
				+ ", bookingTime=" + bookingTime + ", transactionId=" + transactionId + ", totalCost=" + totalCost
				+ ", noOfSeats=" + noOfSeats + ", ticket=" + ticket + "]";
	}
	
	
	
	

}
