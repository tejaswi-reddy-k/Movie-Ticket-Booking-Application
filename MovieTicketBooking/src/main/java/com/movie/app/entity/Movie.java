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
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "movie_id")
	private Integer movieId;
	@Column(name = "movie_name")
	private String movieName;
	@Column(name = "movie_genre")
	private String movieGenre;
	@Column(name = "movie_hours")
	private String movieHours;
	@Column(name = "movie_language")
	private String movieLanguage;
	@Column(name = "movie_description")
	private String movieDescription;
	@Column(name = "movie_rating")
	private double rating;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "theatre_id")
	private List<Theatre> listOfTheatres;
	@Column(name = "theatre_id")
	private Integer theatre_id;

	public Movie(Integer movieId, String movieName, String movieGenre, String movieHours, String movieLanguage,
			String movieDescription, double rating) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.movieHours = movieHours;
		this.movieLanguage = movieLanguage;
		this.movieDescription = movieDescription;
		this.rating = rating;
	}

}
