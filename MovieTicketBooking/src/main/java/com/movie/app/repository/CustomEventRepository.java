package com.movie.app.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.movie.app.entity.Event;
import com.movie.app.exceptions.EventNotFoundException;

@Repository
public interface CustomEventRepository {
	
	/*
	public Event addEvent(Event event);
	public Event removeEvent(int eventid) throws EventNotFoundException;
	public Event updateEvent(Event event) throws EventNotFoundException;
	
	public Event viewEvent(int eventid) throws EventNotFoundException;
	public List<Event> viewEventList();
	public List<Event> viewEventList(int eventid);
	public List<Event> viewEventList(LocalDate date);
	public List<Event> viewEventList(LocalTime time);
	*/
	
	public List<Event> getEventsByType(String eventType);

	public List<Event> getEventsByLanguage(String eventLanguage);
	
	


}
