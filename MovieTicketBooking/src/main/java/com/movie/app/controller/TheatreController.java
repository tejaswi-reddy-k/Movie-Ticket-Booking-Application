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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.movie.app.entity.Theatre;
import com.movie.app.service.ITheatreService;

@CrossOrigin(origins = {"http://localhost:8091", "http://localhost:4200"},allowedHeaders = "*")
@RestController
public class TheatreController {

	@Autowired
	private ITheatreService service;

	@GetMapping("/gettheatrebyloc/{location}")
	public ResponseEntity<List<Theatre>> getTheatreByLocation(@PathVariable("location") String location) {
		List<Theatre> response = service.getTheatresBasedOnLocation(location);
		return new ResponseEntity<List<Theatre>>(response, HttpStatus.OK);
	}

	@GetMapping("/gettheatrebylocandname")
	public ResponseEntity<List<Theatre>> getTheatreByLocationAndMovieName(@RequestParam("location") String location,
			@RequestParam String movieName) {
		List<Theatre> response = service.getTheatresBasedOnMovieAndLocation(location, movieName);
		return new ResponseEntity<List<Theatre>>(response, HttpStatus.OK);
	}

	@DeleteMapping("/deletetheatre/{theatreid}")
	public ResponseEntity<String> deleteTheatre(@PathVariable("theatreid") Integer theatreid) {
		String response = service.deleteTheatre(theatreid);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	@PostMapping("/addTheatre")
	public ResponseEntity<String> addTheatre(@RequestHeader(name = "movieId") Integer movieId,@RequestBody Theatre theatre) {
		String response = service.addTheatre(theatre,movieId);
		return new ResponseEntity<String>(response, HttpStatus.CREATED);
	}
	
	@GetMapping("/viewalltheatres")
	public ResponseEntity<List<com.movie.app.model.Theatre>> viewTheatres() {
		List<com.movie.app.model.Theatre> response = service.viewTheatreList();
		return new ResponseEntity<List<com.movie.app.model.Theatre>>(response, HttpStatus.OK);
	}
}
