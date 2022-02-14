package com.movie.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.app.entity.Ticket;
import com.movie.app.exceptions.TicketNotFoundException;
import com.movie.app.repository.ITicketRepository;
@Service
public class TicketServiceImpl implements ITicketService{

	@Autowired
	ITicketRepository ticketRepo;
	
	@Override
	public Ticket getTicketbyId(int ticketId) throws TicketNotFoundException {
			return ticketRepo.findById(ticketId).get();
		}

	@Override
	public Ticket addTicket(Ticket ticket) {
		return ticketRepo.save(ticket);
	}

	@Override
	public Ticket updateticket(Ticket ticket) throws TicketNotFoundException {
		return ticketRepo.save(ticket);
	}

	@Override
	public void deleteTicket(int ticketid) throws TicketNotFoundException {
		ticketRepo.deleteById(ticketid);
	}

	@Override
	public List<Ticket> viewAllTickets() {
		return ticketRepo.findAll();
	}
}