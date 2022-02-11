package com.movie.app.service;

import org.springframework.stereotype.Service;

import com.movie.app.entity.Movie;

@Service
public interface IAdminService {

	public String addMovieByLocation(Movie movie, String location);

	public String addMovieByCategory(Movie movie, String genre);

	public String addMovieByRating(Movie movie, double rating);
}
