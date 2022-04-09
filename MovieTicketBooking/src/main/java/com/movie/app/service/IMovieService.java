package com.movie.app.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.movie.app.entity.Movie;
import com.movie.app.entity.Theatre;
import com.movie.app.exceptions.MovieNotFoundException;
import com.movie.app.exceptions.TheatreExistsException;

@Service
public interface IMovieService {

	public String addMovie(com.movie.app.model.Movie movie);

	public String removeMovie(int movieid) throws MovieNotFoundException;

	public String updateMovie(int movieid,com.movie.app.model.Movie movie) throws MovieNotFoundException, TheatreExistsException;

	public com.movie.app.model.Movie viewMovie(int movieid) throws MovieNotFoundException;
	
	public List<Movie> viewMoviesByGenre(String genre) throws MovieNotFoundException;

	public List<com.movie.app.model.Movie> viewMovieList();

	public List<Theatre> viewTheatresByMovieId(int movieid) throws MovieNotFoundException;
}
