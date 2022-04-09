package com.movie.app.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.movie.app.entity.Theatre;

@RunWith(SpringJUnit4ClassRunner.class)
public class ITheatreServiceImplTest {

	@Mock
	ITheatreServiceImpl theatreservice;

	@Test
	public void addTheatre() {
		when((theatreservice.addTheatre(new Theatre(100, "Swamy", "guntur", "ap", 100,100),1)))
				.thenReturn("Theatre added Successfully");
		assertEquals(theatreservice.addTheatre(new Theatre(),1), "Theatre added Successfully");
	}

	@Test
	public void deleteTheatre() {
		when((theatreservice.deleteTheatre(1))).thenReturn("Theatre removed Successfully");
		assertEquals(theatreservice.deleteTheatre(1), "Theatre removed Successfully");
	}

	@Test
	public void getTheatresBasedOnLocation() {
		when((theatreservice.getTheatresBasedOnLocation("guntur"))).thenReturn(null);
		assertEquals(theatreservice.getTheatresBasedOnLocation("guntur"), null);
	}

	@Test
	public void getTheatresBasedOnMovieAndLocation() {
		when((theatreservice.getTheatresBasedOnMovieAndLocation("race", "guntur"))).thenReturn(null);
		assertEquals(theatreservice.getTheatresBasedOnMovieAndLocation("race", "guntur"), null);
	}

}
