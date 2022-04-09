package com.movie.app.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Theatre {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "theatre_id")
	private int theatreId;
	private String theatreName;
	private String theatreCity;
	private String theatreLocation;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "movie_id")
	private Movie movie;
	@Column(name = "total_seats")
	private Integer totalSeats;
	@Column(name = "seat_cost")
	private Integer seatCost;

	public Theatre(int theatreId, String theatreName, String theatreCity, String theatreLocation, Integer totalSeats,
			Integer seatCost) {
		super();
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.theatreCity = theatreCity;
		this.theatreLocation = theatreLocation;
		this.totalSeats = totalSeats;
		this.seatCost = seatCost;
	}

}
