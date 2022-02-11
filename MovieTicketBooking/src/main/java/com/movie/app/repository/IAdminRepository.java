package com.movie.app.repository;

import com.movie.app.entity.Movie;

public interface IAdminRepository {

	public String addMovieByLocation(Movie movie,String location);

	public String addMovieByCategory(Movie movie,String genre);

	public String addMovieByRating(Movie movie,double rating);
}
