package com.movie.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.movie.app.entity.Movie;
import com.movie.app.entity.Theatre;
import com.movie.app.exceptions.MovieNotFoundException;
import com.movie.app.exceptions.TheatreExistsException;
import com.movie.app.repository.IMovieRepository;
import com.movie.app.repository.ITheatreRepository;

@Service
public class IMovieServiceImpl implements IMovieService {

	@Autowired
	private IMovieRepository repository;
	
	@Autowired
	private ITheatreRepository theatreRepository;

	@Override
	public String addMovie(com.movie.app.model.Movie movie) {
		Movie movieEntity = new Movie();
		BeanUtils.copyProperties(movie, movieEntity);
		repository.save(movieEntity);
		return String.format("Movie %s added successfully with movieid %s", movieEntity.getMovieName(),movieEntity.getMovieId());
	}

	@Override
	public String removeMovie(int movieid) throws MovieNotFoundException {
		Optional<Movie> movieoptional = repository.findById(movieid);
		if (!movieoptional.isPresent())
			throw new MovieNotFoundException("Movie not found");
		repository.deleteById(movieid);
		return "Movie removed successfully";
	}

	@Override
	public String updateMovie(int movieid,com.movie.app.model.Movie movie) throws MovieNotFoundException, TheatreExistsException {
		Boolean theatreExists =false;
		Optional<Movie> movieoptional = repository.findById(movieid);
		if (!movieoptional.isPresent())
			throw new MovieNotFoundException("Movie not found");
		Movie getmovie = movieoptional.get();
		getmovie.setMovieDescription(movie.getMovieDescription());
		getmovie.setMovieId(getmovie.getMovieId());
		getmovie.setMovieHours(movie.getMovieHours());
		getmovie.setRating(movie.getRating());
		getmovie.setMovieLanguage(movie.getMovieLanguage());
		getmovie.setMovieGenre(movie.getMovieGenre());
		getmovie.setMovieName(movie.getMovieName());
		List<Theatre> theatresList = getmovie.getListOfTheatres();
		Optional<Theatre> theatreEntity = theatreRepository.findBytheatreName(movie.getTheatreName());
		if(theatreEntity.isPresent())
		{
			for(Theatre theatre : theatresList)
			{
				if(theatre.getTheatreId()==theatreEntity.get().getTheatreId())
				{
					theatreExists = true;
				}
			}
			if(!theatreExists) 
			{
				theatreEntity.get().setMovie(getmovie);
				theatresList.add(theatreEntity.get());
			}
			else
			{
				throw new TheatreExistsException("Theatre already has that movie");
			}
		}
		repository.save(getmovie);
		return "Movie updated successfully";
	}

	@Override
	public com.movie.app.model.Movie viewMovie(int movieid) throws MovieNotFoundException {
		com.movie.app.model.Movie movieModel = new com.movie.app.model.Movie();
		Optional<Movie> movieoptional = repository.findById(movieid);
		if (!movieoptional.isPresent())
			throw new MovieNotFoundException("Movie not found");
		Movie movie = movieoptional.get();
		BeanUtils.copyProperties(movie, movieModel);
		if(movie.getListOfTheatres()!=null && !movie.getListOfTheatres().isEmpty())
		{
			List<com.movie.app.model.Theatre> theatreList = new ArrayList<>();
			for (Theatre theatre : movie.getListOfTheatres()) 
			{
				com.movie.app.model.Theatre theatreModel = new com.movie.app.model.Theatre();
				BeanUtils.copyProperties(theatre, theatreModel);
				theatreList.add(theatreModel);
			}
			movieModel.setListOfTheatres(theatreList);
		}
		return movieModel;
	}

	@Override
	public List<com.movie.app.model.Movie> viewMovieList() {
		
		List<com.movie.app.model.Movie> movieModels = new ArrayList<>();
		List<Movie> movieEntities = repository.findAll();
		if(movieEntities != null && !movieEntities.isEmpty())
		{
			for(Movie movie : movieEntities)
			{
				com.movie.app.model.Movie movieModel = new com.movie.app.model.Movie();
				BeanUtils.copyProperties(movie, movieModel);
				if(movie.getListOfTheatres()!=null && !movie.getListOfTheatres().isEmpty())
				{
					List<com.movie.app.model.Theatre> theatreList = new ArrayList<>();
					for (Theatre theatre : movie.getListOfTheatres()) 
					{
						com.movie.app.model.Theatre theatreModel = new com.movie.app.model.Theatre();
						BeanUtils.copyProperties(theatre, theatreModel);
						theatreList.add(theatreModel);
					}
					movieModel.setListOfTheatres(theatreList);
				}
				movieModels.add(movieModel);
			}
		}
		return movieModels;
	}

	@Override
	public List<Theatre> viewTheatresByMovieId(int movieid) throws MovieNotFoundException {
		Optional<Movie> movieoptional = repository.findById(movieid);
		if (!movieoptional.isPresent())
			throw new MovieNotFoundException("Movie not found");
		return movieoptional.get().getListOfTheatres();
	}

	@Override
	public List<Movie> viewMoviesByGenre(String genre) throws MovieNotFoundException {
		return repository.findByGenre(genre);
	}

}
