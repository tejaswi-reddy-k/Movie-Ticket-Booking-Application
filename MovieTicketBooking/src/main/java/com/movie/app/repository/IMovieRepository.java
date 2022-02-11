package com.movie.app.repository;

import java.time.LocalDate;
import java.util.List;

import com.movie.app.entity.Movie;
import com.movie.app.exceptions.MovieNotFoundException;

public interface IMovieRepository {

	public Movie addMovie(Movie movie);
	public Movie removeMovie(int movieid) throws MovieNotFoundException;
	public Movie updateMovie(Movie movie) throws MovieNotFoundException;
	public Movie viewMovie(int movieid) throws MovieNotFoundException;
	public List<Movie> viewMovieList();
	public List<Movie> viewMovieList(int theatreid);
	public List<Movie> viewMovieList(LocalDate date);
	
}
