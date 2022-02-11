package com.movie.app.repository;

public interface IAdminRepository {

	public String addMovieByLocation(String location);

	public String addMovieByCategory(String genre);

	public String addMovieByRating(int rating);
}
