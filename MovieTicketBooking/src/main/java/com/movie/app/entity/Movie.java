package com.movie.app.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {

	@Id
	private int movieId;
	private String movieName;
	private String movieGenre;
	private String movieHours;
	private String movieLanguage;
	private String movieDescription;
	private List<String> locations;
	private double rating;
	
	
	public Movie() {
		
	}
	public Movie(int movieId, String movieName, String movieGenre, String movieHours, String movieLanguage,
			String movieDescription, List<String> locations, double rating) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.movieHours = movieHours;
		this.movieLanguage = movieLanguage;
		this.movieDescription = movieDescription;
		this.locations = locations;
		this.rating = rating;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
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
	public List<String> getLocations() {
		return locations;
	}
	public void setLocations(List<String> locations) {
		this.locations = locations;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieGenre=" + movieGenre + ", movieHours="
				+ movieHours + ", movieLanguage=" + movieLanguage + ", movieDescription=" + movieDescription
				+ ", locations=" + locations + ", rating=" + rating + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(locations, movieDescription, movieGenre, movieHours, movieId, movieLanguage, movieName,
				rating);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(locations, other.locations) && Objects.equals(movieDescription, other.movieDescription)
				&& Objects.equals(movieGenre, other.movieGenre) && Objects.equals(movieHours, other.movieHours)
				&& movieId == other.movieId && Objects.equals(movieLanguage, other.movieLanguage)
				&& Objects.equals(movieName, other.movieName)
				&& Double.doubleToLongBits(rating) == Double.doubleToLongBits(other.rating);
	}

	

}
