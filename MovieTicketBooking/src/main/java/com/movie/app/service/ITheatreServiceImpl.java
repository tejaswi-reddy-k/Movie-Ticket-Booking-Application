package com.movie.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.app.entity.Movie;
import com.movie.app.entity.Theatre;
import com.movie.app.repository.IMovieRepository;
import com.movie.app.repository.ITheatreRepository;

@Service
public class ITheatreServiceImpl implements ITheatreService {

	@Autowired
	private ITheatreRepository repository;
	
	@Autowired
	private IMovieRepository movierepository;

	@Override
	public List<Theatre> getTheatresBasedOnLocation(String location) {
		return repository.findByTheatreLocation(location);
	}

	@Override
	public List<Theatre> getTheatresBasedOnMovieAndLocation(String location, String moviename) {
		return repository.findByTheatreLocationAndMovieName(location, moviename);
	}

	@Override
	public String addTheatre(Theatre theatre,Integer movieId) {
		if(movieId!=null)
		{
			Optional<Movie> movie= movierepository.findById(movieId);
			if(movie.isPresent())
			{
				theatre.setMovie(movie.get());
			}
		}
		repository.save(theatre);
		return "Theatre added succesfully";
	}

	@Override
	public String deleteTheatre(Integer theatreId) {
		repository.deleteById(theatreId);
		return "Deleted theatre successfully";
	}

	@Override
	public List<com.movie.app.model.Theatre> viewTheatreList() 
	{
		List<com.movie.app.model.Theatre> theatreModels = new ArrayList<>();
		List<Theatre> theatreEntities = repository.findAll();
		if(theatreEntities != null && !theatreEntities.isEmpty())
		{
			for(Theatre theatre : theatreEntities)
			{
				com.movie.app.model.Theatre theatreModel = new com.movie.app.model.Theatre();
				BeanUtils.copyProperties(theatre, theatreModel);
				Movie movie = theatre.getMovie();
				if(movie!=null)
				{
					com.movie.app.model.Movie movieModel =new com.movie.app.model.Movie();
					BeanUtils.copyProperties(movie, movieModel);
					theatreModel.setMovie(movieModel);
				}
				theatreModels.add(theatreModel);
			}
		}
		return theatreModels;
	}
}
