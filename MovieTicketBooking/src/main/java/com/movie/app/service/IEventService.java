package com.movie.app.service;

import java.time.LocalDate;
import java.util.List;

import com.movie.app.entity.Event;
import com.movie.app.exceptions.EventNotFoundException;

public interface IEventService {
	public Event addEvent(Event event);
	public Event removeEvent(int eventid) throws EventNotFoundException;
	public Event updateEvent(Event event) throws EventNotFoundException;
	public Event view(int eventid) throws EventNotFoundException;
	public List<Event> viewEventList();
	public List<Event> viewEventList(int theatreid);
	public List<Event> viewEventList(LocalDate date);

}
