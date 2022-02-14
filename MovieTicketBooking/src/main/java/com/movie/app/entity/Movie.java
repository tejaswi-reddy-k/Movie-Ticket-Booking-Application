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
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}
	public String getMovieHours() {
		return movieHours;
	}
	public void setMovieHours(String movieHours) {
		this.movieHours = movieHours;
	}
	public String getMovieLanguage() {
		return movieLanguage;
	}
	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}
	public String getMovieDescription() {
		return movieDescription;
	}
	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public List<Theatre> getListOfTheatres() {
		return listOfTheatres;
	}
	public void setListOfTheatres(List<Theatre> listOfTheatres) {
		this.listOfTheatres = listOfTheatres;
	}
	public Integer getTheatre_id() {
		return theatre_id;
	}
	public void setTheatre_id(Integer theatre_id) {
		this.theatre_id = theatre_id;
	}
	
	
}
