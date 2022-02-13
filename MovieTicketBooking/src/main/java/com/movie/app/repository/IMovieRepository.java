package com.movie.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.movie.app.entity.Movie;

@Repository
public interface IMovieRepository extends JpaRepository<Movie, Integer> {


}
