package com.movie.app.entity;

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
	private double rating;

	public Movie() {

	}

	public Movie(int movieId, String movieName, String movieGenre, String movieHours, String movieLanguage,
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

	public Movie(String movieName, String movieGenre, String movieHours, String movieLanguage, String movieDescription,
			double rating) {
		super();
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.movieHours = movieHours;
		this.movieLanguage = movieLanguage;
		this.movieDescription = movieDescription;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieGenre=" + movieGenre + ", movieHours="
				+ movieHours + ", movieLanguage=" + movieLanguage + ", movieDescription=" + movieDescription
				+ ", rating=" + rating + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(movieDescription, movieGenre, movieHours, movieId, movieLanguage, movieName, rating);
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
		return Objects.equals(movieDescription, other.movieDescription) && Objects.equals(movieGenre, other.movieGenre)
				&& Objects.equals(movieHours, other.movieHours) && movieId == other.movieId
				&& Objects.equals(movieLanguage, other.movieLanguage) && Objects.equals(movieName, other.movieName)
				&& Double.doubleToLongBits(rating) == Double.doubleToLongBits(other.rating);
	}

}
