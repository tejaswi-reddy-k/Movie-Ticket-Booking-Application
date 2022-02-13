package com.movie.app.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import lombok.Data;

@Data
@Entity
public class Theatre {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "theatre_id")
	private Integer theatreId;
	@Column(name = "theatre_name")
	private String theatreName;
	@Column(name = "theatre_location")
	private String theatreLocation;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "movie_id")
	private List<Movie> listOfMovies;
	@Column(name = "total_seats")
	private Integer totalSeats;
	@Column(name = "bookedSeats")
	private Integer bookedSeats;
	@Column(name = "seat_cost")
	private Integer seatCost;
	@Column(name = "movie_id")
	private Integer movieId;

}
