package com.movie.app.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
		assertEquals(theatreservice.addTheatre(new Theatre()), "Theatre added successfully");
	}

	@Test
	void deleteTheatre() {
		when((theatreservice.deleteTheatre(1))).thenReturn("Theatre removed Successfully");
		assertEquals(theatreservice.deleteTheatre(1), "Theatre removed successfully");
	}

	@Test
	void getTheatresBasedOnLocation() {
		when((theatreservice.getTheatresBasedOnLocation("guntur"))).thenReturn(null);
		assertEquals(theatreservice.getTheatresBasedOnLocation("guntur"), null);
	}

	@Test
	void getTheatresBasedOnMovieAndLocation() {
		when((theatreservice.getTheatresBasedOnMovieAndLocation("race", "guntur"))).thenReturn(null);
		assertEquals(theatreservice.getTheatresBasedOnMovieAndLocation("race", "guntur"), null);
	}

}
