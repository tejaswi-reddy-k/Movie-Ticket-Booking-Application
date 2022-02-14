package com.movie.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movie.app.entity.Ticket;
import com.movie.app.exceptions.TicketNotFoundException;
@Service
public interface ITicketService {
public Ticket addTicket(Ticket ticker);
public Ticket updateticket(Ticket ticket) throws TicketNotFoundException;
public void deleteTicket(int ticketid) throws TicketNotFoundException;
public Ticket getTicketbyId(int ticketId) throws TicketNotFoundException;
public List<Ticket> viewAllTickets();
}
