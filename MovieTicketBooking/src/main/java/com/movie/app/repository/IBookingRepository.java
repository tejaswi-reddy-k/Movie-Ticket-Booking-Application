package com.movie.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.movie.app.entity.Booking;

@Repository
public interface IBookingRepository extends CrudRepository<Booking, Integer> ,
CustomBookingRepository {


	
	// findALL , Save, findById , delete 
				// +
				
				// methods from custom event repository

}
