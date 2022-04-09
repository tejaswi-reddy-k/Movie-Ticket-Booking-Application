package com.movie.app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Theatre {
	
	private int theatreId;
	private String theatreName;
	private String theatreCity;
	private String theatreLocation;
	private Movie movie;
	private Integer totalSeats;
	private Integer seatCost;

}
