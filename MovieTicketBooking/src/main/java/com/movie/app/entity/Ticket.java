package com.movie.app.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

@Entity
public class Ticket {
	
	public Ticket(int ticketId, List<String> seatNumber, @AssertTrue boolean ticketStatus,
			@NotNull(message = "Screen Name Cannot be left Blank") String screenName) {
		super();
		this.ticketId = ticketId;
		this.seatNumber = seatNumber;
		this.ticketStatus = ticketStatus;
		this.screenName = screenName;
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private int ticketId;
	
	//private int noOfSeats;
	@OneToOne(cascade=CascadeType.ALL)
	private List<String> seatNumber;
	//private Booking bookingRef;
	@AssertTrue
	private boolean ticketStatus;
	@NotNull(message = "Screen Name Cannot be left Blank")
	private String screenName;
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	/*public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}*/
	public List<String> getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(List<String> seatNumber) {
		this.seatNumber = seatNumber;
	}
	/*public Booking getBookingRef() {
		return bookingRef;
	}
	public void setBookingRef(Booking bookingRef) {
		this.bookingRef = bookingRef;
	}*/
	public boolean isTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(boolean ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(screenName, seatNumber, ticketId, ticketStatus);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		return Objects.equals(screenName, other.screenName) && Objects.equals(seatNumber, other.seatNumber)
				&& ticketId == other.ticketId && ticketStatus == other.ticketStatus;
	}
	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", seatNumber=" + seatNumber + ", ticketStatus=" + ticketStatus
				+ ", screenName=" + screenName + "]";
	}
	
	
	
	

}
