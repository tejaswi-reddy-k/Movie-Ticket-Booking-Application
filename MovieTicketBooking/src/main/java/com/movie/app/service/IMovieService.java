package com.movie.app.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.movie.app.entity.Movie;
import com.movie.app.entity.Theatre;
import com.movie.app.exceptions.MovieNotFoundException;

@Service
public interface IMovieService {

	public String addMovie(Movie movie);

	public String removeMovie(int movieid) throws MovieNotFoundException;

	public String updateMovie(Movie movie) throws MovieNotFoundException;

	public Movie viewMovie(int movieid) throws MovieNotFoundException;
	
	public List<Movie> viewMoviesByGenre(String genre) throws MovieNotFoundException;

	public List<Movie> viewMovieList();

	public List<Theatre> viewTheatresByMovieId(int movieid) throws MovieNotFoundException;
}
