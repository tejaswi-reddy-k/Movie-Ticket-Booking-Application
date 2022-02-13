package com.movie.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.movie.app.entity.Event;

@Repository
public interface IEventRepository extends CrudRepository<Event, Integer> ,
CustomEventRepository {

	//public List<Event> getEventsByType(String eventType);

	//public List<Event> getEventsByLanguage(String eventLanguage);
	
	// findALL , Save, findById , delete 
			// +
			
			// methods from custom event repository

}
