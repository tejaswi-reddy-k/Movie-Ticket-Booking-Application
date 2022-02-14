package com.movie.app.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Min;

@Entity
public class Booking {
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(int bookingId, int businessId, LocalDate bookingDate, LocalTime bookingTime, int transactionId,
			@Min(value = 500000, message = "Min rage of total booking cost is 500000.00") double totalCost,
			@Min(value = 5000, message = "Min Seats booked is 5000") int noOfSeats, List<Ticket> listOfticket) {
		super();
		this.bookingId = bookingId;
		this.businessId = businessId;
		this.bookingDate = bookingDate;
		this.bookingTime = bookingTime;
		this.transactionId = transactionId;
		this.totalCost = totalCost;
		this.noOfSeats = noOfSeats;
		this.listOfticket = listOfticket;
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
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "ticket_id")
	private List<Ticket> listOfticket;
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
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
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public List<Ticket> getListOfticket() {
		return listOfticket;
	}
	public void setListOfticket(List<Ticket> listOfticket) {
		this.listOfticket = listOfticket;
	}
	@Override
	public int hashCode() {
		return Objects.hash(bookingDate, bookingId, bookingTime, businessId, listOfticket, noOfSeats, totalCost,
				transactionId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Booking other = (Booking) obj;
		return Objects.equals(bookingDate, other.bookingDate) && bookingId == other.bookingId
				&& Objects.equals(bookingTime, other.bookingTime) && businessId == other.businessId
				&& Objects.equals(listOfticket, other.listOfticket) && noOfSeats == other.noOfSeats
				&& Double.doubleToLongBits(totalCost) == Double.doubleToLongBits(other.totalCost)
				&& transactionId == other.transactionId;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", businessId=" + businessId + ", bookingDate=" + bookingDate
				+ ", bookingTime=" + bookingTime + ", transactionId=" + transactionId + ", totalCost=" + totalCost
				+ ", noOfSeats=" + noOfSeats + ", listOfticket=" + listOfticket + "]";
	}
	

}
