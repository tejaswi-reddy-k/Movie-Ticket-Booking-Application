package com.movie.app.service;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.movie.app.entity.Movie;
import com.movie.app.exceptions.MovieNotFoundException;

@SpringBootTest
public class IMovieServiceImplTest {

	@Mock
	IMovieService movieservice;

	@Test
	void addMovie() {
		when(movieservice.addMovie(new Movie())).thenReturn("Movie added successfully");
	}

	@Test
	void removeMovie() throws MovieNotFoundException {
		when((movieservice.removeMovie(1))).thenReturn("Movie removed Successfully");
	}

	@Test
	void viewMovie() throws MovieNotFoundException {
		when((movieservice.viewMovie(198))).thenReturn(null);
	}

	@Test
	void viewMoviesByGenre() throws MovieNotFoundException {
		when((movieservice.viewMoviesByGenre("thriller"))).thenReturn(null);
	}

	@Test
	void viewTheatresByMovieId() throws MovieNotFoundException {
		when((movieservice.viewTheatresByMovieId(2))).thenReturn(null);
	}

	@Test
	void viewMoviesList() throws MovieNotFoundException {
		when((movieservice.viewMovieList())).thenReturn(null);
	}
}
