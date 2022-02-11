package com.movie.app.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Movie {

	@Id
	private int movieId;
	private String movieName;
	private String movieGenre;
	private String movieHours;
	private String movieLanguage;
	private String movieDescription;
	private double rating;

}
