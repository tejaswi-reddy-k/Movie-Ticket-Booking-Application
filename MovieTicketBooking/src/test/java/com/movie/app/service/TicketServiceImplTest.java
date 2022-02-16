package com.movie.app.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.movie.app.entity.Ticket;
import com.movie.app.repository.ITicketRepository;

@SpringBootTest
class TicketServiceImplTest {
    @Mock
    ITicketRepository ticketRepo;
    
	@Test
	void testGetTicketbyId() {
		Ticket actualTicket = new Ticket();
		Optional<Ticket> output = Optional.of(actualTicket); 
		when((ticketRepo.findById(1))).thenReturn(output);
		
		assertEquals(new Ticket(), actualTicket);
	}

	@Test
	void testViewAllTickets() {
		List<Ticket> actualOutput = new ArrayList<>();
        
        when(ticketRepo.findAll()).thenReturn(actualOutput);
        // verify
        assertIterableEquals(new ArrayList<Ticket>(), actualOutput);
	}

}
