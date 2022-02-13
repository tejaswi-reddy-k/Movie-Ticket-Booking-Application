package com.movie.app.service;

import java.time.LocalDateTime;
import java.util.List;

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
	public List<Event> viewEventList(){
		List<Event> list = (List<Event>) repository.findAll();
	     return list;		
	}
	
	@Override
	 public boolean deleteEventByID(int eventid) {
		repository.deleteById(eventid);
		return true;
	}
	
	/*
	@Override
	public Event removeEvent(int eventid) throws EventNotFoundException{
		repository.deleteById(eventid);
		return removeEvent(eventid);		
	}
	*/
	
	@Override
	public boolean checkEventById(int eventid) {
		return repository.existsById(eventid);
	}
	
	/*
	@Override
	public Event searchEvent(int eventid) throws EventNotFoundException{
		
	}*/
	
	@Override
	public Event addEvent(Event newEvent)
	{
		return null;
	}
	
	@Override
	public Event updateEvent(Event updatedEvent, int eventid) throws EventNotFoundException{
		return null;
	}
	
	@Override
	public List<Event> getEventsByType(String eventType) throws EventNotFoundException 
	{
		return repository.getEventsByType(eventType);
	}
	
	@Override
	public List<Event> getEventsByLanguage(String eventLanguage) throws EventNotFoundException 
	{
		return repository.getEventsByLanguage(eventLanguage);
	}

	/*
	@Override
	public List<Event> viewEventList(int eventid) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Event> viewEventList(LocalDateTime time){
		
	}
	*/

}
