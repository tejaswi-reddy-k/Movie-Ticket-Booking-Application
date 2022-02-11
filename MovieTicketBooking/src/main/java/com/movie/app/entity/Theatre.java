package com.movie.app.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Theatre {

	@Id
	private Integer theatreId;
	private String theatreName;
	private String theatreLocation;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "movieId")
	private List<Movie> listOfMovies;
	private Integer totalseats;
	private Integer bookedseats;
	private Integer seatcost;
	private Integer movieId;
}
