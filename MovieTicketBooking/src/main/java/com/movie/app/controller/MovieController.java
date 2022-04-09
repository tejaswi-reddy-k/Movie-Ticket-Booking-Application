package com.movie.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.movie.app.entity.Movie;
import com.movie.app.entity.Theatre;
import com.movie.app.exceptions.MovieNotFoundException;
import com.movie.app.exceptions.TheatreExistsException;
import com.movie.app.service.IMovieService;

@CrossOrigin(origins = {"http://localhost:8091", "http://localhost:4200"},allowedHeaders = "*")
@RestController
@RequestMapping("/MovieBooking")
public class MovieController {

	@Autowired
	private IMovieService service;

	@PostMapping("/addmovie")
	public ResponseEntity<String> addMovie(@RequestBody com.movie.app.model.Movie movie) {
		String response = service.addMovie(movie);
		return new ResponseEntity<String>(response, HttpStatus.CREATED);
	}

	@DeleteMapping("/deletemovie/{movieid}")
	public ResponseEntity<String> deleteMovie(@PathVariable("movieid") Integer movieid) throws MovieNotFoundException {
		String response = service.removeMovie(movieid);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	@PutMapping("/updatemovie/{movieid}")
	public ResponseEntity<String> updateMovie(@PathVariable("movieid") Integer movieid,@RequestBody com.movie.app.model.Movie movie) throws MovieNotFoundException, TheatreExistsException {
		String response = service.updateMovie(movieid,movie);
		return new ResponseEntity<String>(response, HttpStatus.CREATED);
	}

	@GetMapping("/viewmovie/{movieid}")
	public ResponseEntity<com.movie.app.model.Movie> viewMovie(@PathVariable("movieid") Integer movieId) throws MovieNotFoundException {
		com.movie.app.model.Movie response = service.viewMovie(movieId);
		return new ResponseEntity<com.movie.app.model.Movie>(response, HttpStatus.OK);
	}

	@GetMapping("/viewallmovies")
	public ResponseEntity<List<com.movie.app.model.Movie>> viewMovie() {
		List<com.movie.app.model.Movie> response = service.viewMovieList();
		return new ResponseEntity<List<com.movie.app.model.Movie>>(response, HttpStatus.OK);
	}

	@GetMapping("/viewtheatresbymovieid/{movieid}")
	public ResponseEntity<List<Theatre>> viewTheatresByMovieId(@PathVariable("movieid") Integer movieId)
			throws MovieNotFoundException {
		List<Theatre> response = service.viewTheatresByMovieId(movieId);
		return new ResponseEntity<List<Theatre>>(response, HttpStatus.OK);
	}

	@GetMapping("/viewmoviesbygenre/{genre}")
	public ResponseEntity<List<Movie>> viewMoviesByGenre(@PathVariable("genre") String genre)
			throws MovieNotFoundException {
		List<Movie> response = service.viewMoviesByGenre(genre);
		return new ResponseEntity<List<Movie>>(response, HttpStatus.OK);
	}
}
