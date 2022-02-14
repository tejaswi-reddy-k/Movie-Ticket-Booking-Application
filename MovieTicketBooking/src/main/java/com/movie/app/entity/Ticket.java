package com.movie.app.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

@Entity
public class Ticket {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private int ticketId;
	private int seatnumber;
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

	public int getSeatNumber() {
		return seatnumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatnumber = seatNumber;
	}

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
		return Objects.hash(screenName, seatnumber, ticketId, ticketStatus);
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
		return  Objects.equals(screenName, other.screenName) && Objects.equals(seatnumber, other.seatnumber) && ticketId == other.ticketId
				&& ticketStatus == other.ticketStatus;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", seatNumber=" + seatnumber + ", ticketStatus=" + ticketStatus
				+ ", screenName=" + screenName + "]";
	}
	
	

}