package com.movie.app.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.movie.app.entity.Event;
import com.movie.app.exceptions.EventNotFoundException;

@Service
public interface IEventService {

	public Event addEvent(Event event);

	public Event cancelEvent(int eventid) throws EventNotFoundException;

	public String updateEvent(Event event) throws EventNotFoundException;

	public List<Event> viewEventList();

	public Event getEventById(int eventid);

	public boolean checkEventById(int eventid);

	public List<Event> getEventsByType(String eventType) throws EventNotFoundException;

	public List<Event> getEventsByLanguage(String eventLanguage) throws EventNotFoundException;

}
