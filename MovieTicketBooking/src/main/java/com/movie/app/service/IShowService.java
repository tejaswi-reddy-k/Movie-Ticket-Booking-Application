package com.movie.app.service;

import java.time.LocalDate;
import java.util.List;

import com.movie.app.entity.Show;
import com.movie.app.exceptions.ShowNotFoundException;

public interface IShowService {
	
	public Show addShow(Show show);
	public Show updateShow(Show show) throws ShowNotFoundException;
	public Show removeShow(int showid) throws ShowNotFoundException;
	public Show viewShow(int showid) throws ShowNotFoundException;
	public List<Show> viewAllShows();
	public List<Show> viewShowList(int theatreid)throws ShowNotFoundException;
	public List<Show> viewShowList(LocalDate date)throws ShowNotFoundException;

}
