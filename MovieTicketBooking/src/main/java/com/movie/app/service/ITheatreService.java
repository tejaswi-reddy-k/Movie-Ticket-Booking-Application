package com.movie.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movie.app.entity.Theatre;

@Service
public interface ITheatreService {

	public List<Theatre> getTheatresBasedOnLocation(String location);

	public List<Theatre> getTheatresBasedOnMovieAndLocation(String location, String moviename);

	public String addTheatre(Theatre theatre);

	public String deleteTheatre(Integer theatreId);

}
