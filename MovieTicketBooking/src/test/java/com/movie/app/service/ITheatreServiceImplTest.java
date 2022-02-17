package com.movie.app.service;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.movie.app.entity.Theatre;

@SpringBootTest
public class ITheatreServiceImplTest {

	@Mock
	ITheatreService theatreservice;

	@Test
	void addTheatre() {
		when((theatreservice.addTheatre(new Theatre()))).thenReturn("Theatre added Successfully");
	}

	@Test
	void deleteTheatre() {
		when((theatreservice.deleteTheatre(1))).thenReturn("Theatre removed Successfully");
	}

	@Test
	void getTheatresBasedOnLocation() {
		when((theatreservice.getTheatresBasedOnLocation("guntur"))).thenReturn(null);
	}

	@Test
	void getTheatresBasedOnMovieAndLocation() {
		when((theatreservice.getTheatresBasedOnMovieAndLocation("race", "guntur"))).thenReturn(null);
	}

}
