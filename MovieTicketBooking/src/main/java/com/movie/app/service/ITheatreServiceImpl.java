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
	public Theatre addTheatre(Theatre theatre) {
		return repository.save(theatre);
	}
	
}
