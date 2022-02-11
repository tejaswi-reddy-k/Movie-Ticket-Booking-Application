package com.movie.app.service;

import com.movie.app.entity.Movie;
import com.movie.app.repository.IAdminRepository;

public class IAdminServiceImpl implements IAdminService {

	private IAdminRepository repo;

	@Override
	public String addMovieByLocation(Movie movie,String location) {
		return repo.addMovieByLocation(movie,location);
	}

	@Override
	public String addMovieByCategory(Movie movie,String genre) {
		return repo.addMovieByCategory(movie,genre);
	}

	@Override
	public String addMovieByRating(Movie movie,double rating) {
		return repo.addMovieByRating(movie,rating);
	}

}
