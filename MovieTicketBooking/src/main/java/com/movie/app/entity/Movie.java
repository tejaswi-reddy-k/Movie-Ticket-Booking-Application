package com.movie.app.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "movie_id")
	private int movieId;
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

}
