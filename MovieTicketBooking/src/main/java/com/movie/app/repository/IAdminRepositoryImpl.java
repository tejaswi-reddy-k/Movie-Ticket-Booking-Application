package com.movie.app.repository;

import javax.persistence.EntityManager;

import com.movie.app.util.JPAUtil;

public class IAdminRepositoryImpl implements IAdminRepository {

	private EntityManager entityManager;

	public IAdminRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public String addMovieByLocation(String location) {

		return null;
	}

	@Override
	public String addMovieByCategory(String genre) {

		return null;
	}

	@Override
	public String addMovieByRating(int rating) {

		return null;
	}
}
