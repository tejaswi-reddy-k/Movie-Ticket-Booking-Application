package com.movie.app.service;

import com.movie.app.repository.IAdminRepository;

public class IAdminServiceImpl implements IAdminService {

	private IAdminRepository repo;

	@Override
	public String addMovieByLocation(String location) {
		return repo.addMovieByLocation(location);
	}

	@Override
	public String addMovieByCategory(String genre) {
		return repo.addMovieByCategory(genre);
	}

	@Override
	public String addMovieByRating(int rating) {
		return repo.addMovieByRating(rating);
	}

}
