package com.movie.app.service;

import com.movie.app.entity.Seat;

public interface ISeatService {

	public Seat bookSeat(Seat seat);
	public Seat cancelSeatBooking(Seat seat);
	public Seat blockSeat(Seat seat); //not available for any booking 
	
}
