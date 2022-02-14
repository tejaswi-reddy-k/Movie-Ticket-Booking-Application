package com.movie.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.app.entity.Ticket;
import com.movie.app.exceptions.TicketNotFoundException;
import com.movie.app.service.ITicketService;

@RestController
public class TicketController {

	@Autowired
	ITicketService ticketService;
	
	@GetMapping("/getticket/{ticketid}")
	public Ticket getTicketbyId(@PathVariable("ticketId") int ticketId) throws TicketNotFoundException
	{
		return ticketService.getTicketbyId(ticketId);
	}
	
	@PostMapping("/addticket")
    public Ticket addCustomer(@RequestBody Ticket ticket)
    {
    	return ticketService.addTicket(ticket);
		
    }
    
    @PutMapping("/updateticket")  
    public Ticket update(@RequestBody Ticket ticket) throws TicketNotFoundException   
    {  
    	return ticketService.updateticket(ticket);
    }  
    
	@DeleteMapping("/remove/{ticketId}")
	public void deletebyid(@PathVariable int ticketId) throws TicketNotFoundException
	{
		ticketService.deleteTicket(ticketId);
	}
    
	@GetMapping("/tickets")
    public List<Ticket> getAllTickets() {
        return ticketService.viewAllTickets();
    }
}
