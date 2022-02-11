package com.movie.app.repository;

import org.springframework.stereotype.Repository;

import com.movie.app.entity.Movie;

@Repository
public interface IAdminRepository {

	public String addMovieByLocation(Movie movie, String location);

	public String addMovieByCategory(Movie movie, String genre);

	public String addMovieByRating(Movie movie, double rating);
}
