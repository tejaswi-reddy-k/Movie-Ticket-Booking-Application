package com.movie.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.app.entity.Ticket;

public interface ITicketRepository extends JpaRepository<Ticket, Integer>{

}
