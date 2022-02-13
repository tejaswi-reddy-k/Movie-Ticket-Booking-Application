package com.movie.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.movie.app.entity.Movie;
import com.movie.app.entity.Theatre;
import com.movie.app.exceptions.MovieNotFoundException;
import com.movie.app.repository.IMovieRepository;

@Service
public class IMovieServiceImpl implements IMovieService {

	@Autowired
	private IMovieRepository repository;

	@Override
	public String addMovie(Movie movie) {
		repository.save(movie);
		return "Movie added successfully";
	}

	@Override
	public String removeMovie(int movieid) throws MovieNotFoundException {
		Optional<Movie> movieoptional = repository.findById(movieid);
		if (!movieoptional.isPresent())
			throw new MovieNotFoundException("Movie not found");
		repository.deleteById(movieid);
		return "Movie removed successfully";
	}

	@Override
	public String updateMovie(Movie movie) throws MovieNotFoundException {
		Optional<Movie> movieoptional = repository.findById(movie.getMovieId());
		if (!movieoptional.isPresent())
			throw new MovieNotFoundException("Movie not found");
		Movie getmovie = movieoptional.get();
		getmovie.setMovieDescription(movie.getMovieDescription());
		getmovie.setMovieId(movie.getMovieId());
		getmovie.setMovieHours(movie.getMovieHours());
		getmovie.setRating(movie.getRating());
		getmovie.setMovieLanguage(movie.getMovieLanguage());
		getmovie.setMovieGenre(movie.getMovieGenre());
		getmovie.setMovieName(movie.getMovieName());
		repository.save(getmovie);
		return "Movie updated successfully";
	}

	@Override
	public Movie viewMovie(int movieid) throws MovieNotFoundException {
		Optional<Movie> movieoptional = repository.findById(movieid);
		if (!movieoptional.isPresent())
			throw new MovieNotFoundException("Movie not found");
		return movieoptional.get();
	}

	@Override
	public List<Movie> viewMovieList() {
		return repository.findAll();
	}

	@Override
	public List<Theatre> viewTheatresByMovieId(int movieid) throws MovieNotFoundException {
		Optional<Movie> movieoptional = repository.findById(movieid);
		if (!movieoptional.isPresent())
			throw new MovieNotFoundException("Movie not found");
		return movieoptional.get().getListOfTheatres();
	}

}
