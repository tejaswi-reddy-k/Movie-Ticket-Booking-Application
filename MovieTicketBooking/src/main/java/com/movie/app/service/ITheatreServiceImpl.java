package com.movie.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.app.entity.Theatre;
import com.movie.app.repository.ITheatreRepository;

@Service
public class ITheatreServiceImpl implements ITheatreService {
	
	@Autowired
	private ITheatreRepository repository;

	@Override
	public List<Theatre> getTheatresBasedOnLocation(String location) {
		return repository.findByTheatreLocation(location);
	}

	@Override
	public List<Theatre> getTheatresBasedOnMovieAndLocation(String location, String moviename) {
		return repository.findByTheatreLocationAndMovieName(location, moviename);
	}

	@Override
	public String addTheatre(Theatre theatre) {
		repository.save(theatre);
		return "Theatre added succesfully";
	}
	
	@Override
	public String deleteTheatre(Integer theatreId)
	{
		repository.deleteById(theatreId);
		return "Deleted theatre successfully";
	}
}
