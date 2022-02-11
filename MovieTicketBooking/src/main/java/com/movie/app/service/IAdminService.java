package com.movie.app.service;

public interface IAdminService {

	public String addMovieByLocation(String location);

	public String addMovieByCategory(String genre);

	public String addMovieByRating(int rating);
}
