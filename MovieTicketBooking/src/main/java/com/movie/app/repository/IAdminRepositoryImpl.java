package com.movie.app.repository;

import javax.persistence.EntityManager;
import com.movie.app.entity.Movie;
import com.movie.app.util.JPAUtil;

public class IAdminRepositoryImpl implements IAdminRepository {

	private EntityManager entityManager;

	public IAdminRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public String addMovieByLocation(Movie movie, String location) {
		
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(movie);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			return "Movie not added";
		}
		return "Movie succesfully added";
		
	}

	@Override
	public String addMovieByCategory(Movie movie, String genre) {

		try {
			entityManager.getTransaction().begin();
			entityManager.persist(movie);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			return "Movie not added";
		}
		return "Movie succesfully added";

	}

	@Override
	public String addMovieByRating(Movie movie, double rating) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(movie);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			return "Movie not added";
		}
		return "Movie succesfully added";
	}
}
