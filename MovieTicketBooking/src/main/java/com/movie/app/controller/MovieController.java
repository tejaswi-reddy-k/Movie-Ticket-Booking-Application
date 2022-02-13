package com.movie.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.movie.app.entity.Movie;
import com.movie.app.entity.Theatre;
import com.movie.app.exceptions.MovieNotFoundException;
import com.movie.app.service.IMovieService;

@RestController
public class MovieController {

	@Autowired
	private IMovieService service;

	@PostMapping("/addmovie")
	public ResponseEntity<String> addMovie(@RequestBody Movie movie) {
		String response = service.addMovie(movie);
		return new ResponseEntity<String>(response, HttpStatus.CREATED);
	}

	@DeleteMapping("/deletemovie/{movieid}")
	public ResponseEntity<String> deleteMovie(@PathVariable("movieid") Integer movieid) throws MovieNotFoundException {
		String response = service.removeMovie(movieid);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	@PostMapping("/updatemovie")
	public ResponseEntity<String> updateMovie(@RequestBody Movie movie) throws MovieNotFoundException {
		String response = service.updateMovie(movie);
		return new ResponseEntity<String>(response, HttpStatus.CREATED);
	}

	@GetMapping("/viewmovie/{movieid}")
	public ResponseEntity<Movie> viewMovie(@PathVariable("movieid") Integer movieId) throws MovieNotFoundException {
		Movie response = service.viewMovie(movieId);
		return new ResponseEntity<Movie>(response, HttpStatus.OK);
	}

	@GetMapping("/viewallmovies")
	public ResponseEntity<List<Movie>> viewMovie() {
		List<Movie> response = service.viewMovieList();
		return new ResponseEntity<List<Movie>>(response, HttpStatus.OK);
	}

	@GetMapping("/viewtheatresbymovieid/{movieid}")
	public ResponseEntity<List<Theatre>> viewTheatresByMovieId(@PathVariable("movieid") Integer movieId)
			throws MovieNotFoundException {
		List<Theatre> response = service.viewTheatresByMovieId(movieId);
		return new ResponseEntity<List<Theatre>>(response, HttpStatus.OK);
	}
}
