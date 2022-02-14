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

@Entity
@Data
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

}
