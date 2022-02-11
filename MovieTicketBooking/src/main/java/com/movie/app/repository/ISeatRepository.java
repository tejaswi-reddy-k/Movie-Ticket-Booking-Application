package com.movie.app.repository;

import com.movie.app.entity.Seat;

public interface ISeatRepository {
	
	public Seat bookSeat(Seat seat);
	public Seat cancelSeatBooking(Seat seat);
	public Seat blockSeat(Seat seat); //not available for any booking 

}
