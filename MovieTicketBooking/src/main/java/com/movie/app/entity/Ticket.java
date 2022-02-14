package com.movie.app.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

@Entity
public class Ticket {
	
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
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "booking_id")
	private List<Booking> listOfBookings;

}
