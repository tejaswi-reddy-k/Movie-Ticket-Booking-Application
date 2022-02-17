package com.movie.app.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.app.entity.Event;
import com.movie.app.exceptions.EventNotFoundException;
import com.movie.app.repository.IEventRepository;

@Service
public class EventService implements IEventService {

	@Autowired
	IEventRepository repository;

	@Override
	public Event getEventById(int eventid) {
		return repository.findById(eventid).get();
	}

	@Override
	public List<Event> viewEventList() {
		List<Event> list = (List<Event>) repository.findAll();
		return list;
	}

	@Override
	public Event cancelEvent(int eventid) throws EventNotFoundException {
		Optional<Event> eventoptional = repository.findById(eventid);
		if (!eventoptional.isPresent())
			throw new EventNotFoundException("Event not found");
		repository.deleteById(eventid);
		return cancelEvent(eventid);
	}

	@Override
	public boolean checkEventById(int eventid) {
		return repository.existsById(eventid);
	}

	@Override
	public Event addEvent(Event event) {
		return repository.save(event);
	}

	@Override
	public String updateEvent(Event event) throws EventNotFoundException {
		Optional<Event> eventoptional = repository.findById(event.getEventId());
		if (!eventoptional.isPresent())
			throw new EventNotFoundException("Event not found");
		Event getevent = eventoptional.get();
		getevent.setEventId(event.getEventId());
		getevent.setEventName(event.getEventName());
		getevent.setEventType(event.getEventType());
		// getevent.setEventDate(event.getEventDate());
		getevent.setEventLanguage(event.getEventLanguage());
		// getevent.setEventTime(event.getEventTime());
		repository.save(getevent);
		return "Event updated successfully";
	}

	@Override
	public List<Event> getEventsByType(String eventType) throws EventNotFoundException {
		return repository.getEventsByType(eventType);
	}

	@Override
	public List<Event> getEventsByLanguage(String eventLanguage) throws EventNotFoundException {
		return repository.getEventsByLanguage(eventLanguage);
	}

}
