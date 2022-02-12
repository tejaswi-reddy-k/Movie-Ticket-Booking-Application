package com.movie.app.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.movie.app.entity.Event;
import com.movie.app.exceptions.EventNotFoundException;

public interface CustomEventRepository {
	
	public Event addEvent(Event event);
	public Event removeEvent(int eventid) throws EventNotFoundException;
	public Event updateEvent(Event event) throws EventNotFoundException;
	/*
	public Event viewEvent(int eventid) throws EventNotFoundException;
	public List<Event> viewEventList();
	public List<Event> viewEventList(int eventid);
	public List<Event> viewEventList(LocalDate date);
	public List<Event> viewEventList(LocalTime time);
	*/
	
	//for service only

}
