package com.movie.app.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.movie.app.entity.Booking;
import com.movie.app.exceptions.BookingNotFoundException;

@Repository
public interface IBookingRepository extends CrudRepository<Booking, Integer> ,
CustomBookingRepository {


	
	// findALL , Save, findById , delete 
				// +
				
				// methods from custom event repository
	
	@Query(value = "SELECT * FROM booking b WHERE b.localdate BETWEEN '$dt1' AND '$dt2' ", nativeQuery = true)
	public List<Booking> findByDate(LocalDate  date1, LocalDate date2) throws BookingNotFoundException;


}
