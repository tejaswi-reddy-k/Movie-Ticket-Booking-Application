package com.movie.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.movie.app.entity.Theatre;

@Repository
public interface ITheatreRepository extends JpaRepository<Theatre, Integer>{
	
	public List<Theatre> findByTheatreLocation(String theatreLocation);
	
	@Query(value = "Select * from theatre theatre,movie movie where movie.movie_name = ?2 and theatre.theatre_location = ?1 and movie.movie_id = theatre.movie_id", nativeQuery = true)
	public List<Theatre> findByTheatreLocationAndMovieName(String theatreLocation,String movieName);
	
	public Optional<Theatre> findBytheatreName(String theatreName);
}
	
