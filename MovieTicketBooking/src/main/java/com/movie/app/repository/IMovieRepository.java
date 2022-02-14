package com.movie.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.movie.app.entity.Movie;
import com.movie.app.exceptions.MovieNotFoundException;

@Repository
public interface IMovieRepository extends JpaRepository<Movie, Integer> {

	@Query(value = "Select * from movie movie where movie.movie_genre = ?1", nativeQuery = true)
	public List<Movie> findByGenre(String genre) throws MovieNotFoundException;

}
