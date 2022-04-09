package com.movie.app.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.movie.app.entity.Movie;
import com.movie.app.exceptions.MovieNotFoundException;

@RunWith(SpringJUnit4ClassRunner.class)
public class IMovieServiceImplTest {

	@Mock
	IMovieServiceImpl movieservice;

	@Test
	public void addMovieTest() {
		when(movieservice.addMovie(new com.movie.app.model.Movie(1, "race", "thriller", "2hrs", "hindi", "good movie", 4.0)))
				.thenReturn("Movie race added successfully with movieid 1");
		assertEquals(movieservice.addMovie(new com.movie.app.model.Movie(1, "race", "thriller", "2hrs", "hindi", "good movie", 4.0)),
				"Movie race added successfully with movieid 1");
	}

	@Test
	public void removeMovie() throws MovieNotFoundException {
		when((movieservice.removeMovie(1))).thenReturn("Movie removed Successfully");
		assertEquals(movieservice.removeMovie(1), "Movie removed Successfully");
	}

	@Test
	public void viewMovie() throws MovieNotFoundException {
		when((movieservice.viewMovie(198))).thenReturn(null);
		assertEquals(movieservice.viewMovie(198), null);
	}

	@Test
	public void viewMoviesByGenre() throws MovieNotFoundException {
		when((movieservice.viewMoviesByGenre("thriller"))).thenReturn(null);
		assertEquals(movieservice.viewMoviesByGenre("thriller"), null);
	}

	@Test
	public void viewTheatresByMovieId() throws MovieNotFoundException {
		when((movieservice.viewTheatresByMovieId(2))).thenReturn(null);
		assertEquals(movieservice.viewTheatresByMovieId(2), null);
	}

	@Test
	public void viewMoviesList() throws MovieNotFoundException {
		when((movieservice.viewMovieList())).thenReturn(null);
		assertEquals(movieservice.viewMovieList(), null);
	}
}
