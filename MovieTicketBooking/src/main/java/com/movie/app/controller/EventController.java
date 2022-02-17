package com.movie.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movie.app.entity.Event;
import com.movie.app.exceptions.EventNotFoundException;
import com.movie.app.service.IEventService;

@RestController
public class EventController {

	@Autowired
	private IEventService service;

	@PostMapping("/addevent")
	public ResponseEntity<String> addEvent(@RequestBody Event event) {
		Event response = service.addEvent(event);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteevent/{eventid}")
	public ResponseEntity<String> deleteEvent(@PathVariable("eventid") Integer eventid) throws EventNotFoundException {
		Event response = service.cancelEvent(eventid);
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	@PostMapping("/updateevent")
	public ResponseEntity<String> updateEvent(@RequestBody Event event) throws EventNotFoundException {
		String response = service.updateEvent(event);
		return new ResponseEntity<String>(response, HttpStatus.CREATED);
	}

	@GetMapping("/viewallevents")
	public ResponseEntity<List<Event>> viewEvent() {
		List<Event> response = service.viewEventList();
		return new ResponseEntity<List<Event>>(response, HttpStatus.OK);
	}

	@GetMapping("/getevent/{eventid}")
	public ResponseEntity<String> getEventById(@PathVariable("eventid") Integer eventid) {
		Event response = service.getEventById(eventid);
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	@PostMapping("/checkevent/{eventid}")
	public ResponseEntity<String> checkEventById(@PathVariable("eventid") Integer eventid)
			throws EventNotFoundException {
		boolean response = service.checkEventById(eventid);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

	@GetMapping("/geteventsbytype/{eventtype}")
	public ResponseEntity<String> getEventsByType(@PathVariable("eventType") String eventtype)
			throws EventNotFoundException {
		List<Event> response = service.getEventsByType(eventtype);
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	@GetMapping("/geteventsbylanguuage/{eventlanguage}")
	public ResponseEntity<String> getEventsByLanguage(@PathVariable("eventLanguage") String eventlanguage)
			throws EventNotFoundException {
		List<Event> response = service.getEventsByLanguage(eventlanguage);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
}
