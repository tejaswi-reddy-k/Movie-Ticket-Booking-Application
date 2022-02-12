package com.movie.app.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.movie.app.entity.Event;
import com.movie.app.exceptions.EventNotFoundException;

@Service
public interface IEventService {
	
	public Event getEventById(int eventid);
	public boolean deleteEventByID(int eventid);
	public boolean checkEventById(int eventid);
	public List<Event> getEventsByType(String eventType) throws EventNotFoundException;
	public List<Event> getEventsByLanguage(String eventLanguage) throws EventNotFoundException;
	
	public Event addEvent(Event event);
	//public Event removeEvent(int eventid) throws EventNotFoundException;
	public Event updateEvent(Event event) throws EventNotFoundException;
	
	public List<Event> viewEventList();
	public List<Event> viewEventList(int eventid);
	//public List<Event> viewEventList(LocalDate date);
	//public List<Event> viewEventList(LocalTime time);
	//public List<Event> viewEventList(LocalDateTime time);
	
	
	//public Event searchEvent(int eventid) throws EventNotFoundException;

}
