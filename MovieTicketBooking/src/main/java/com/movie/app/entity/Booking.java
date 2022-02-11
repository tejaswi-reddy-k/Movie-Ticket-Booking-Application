package com.movie.app.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class Booking {
	
	private int bookingId;
	private int movieId;
	private int showId;
	private LocalDate bookingDate;
	private Show showRef;
	private int transactionId;
	private double totalCost;
	private List<Seat> seatList;
	private Ticket ticket;
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Show getShowRef() {
		return showRef;
	}
	public void setShowRef(Show showRef) {
		this.showRef = showRef;
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
	public List<Seat> getSeatList() {
		return seatList;
	}
	public void setSeatList(List<Seat> seatList) {
		this.seatList = seatList;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", movieId=" + movieId + ", showId=" + showId + ", bookingDate="
				+ bookingDate + ", showRef=" + showRef + ", transactionId=" + transactionId + ", totalCost=" + totalCost
				+ ", seatList=" + seatList + ", ticket=" + ticket + "]";
	}
	
	

}
