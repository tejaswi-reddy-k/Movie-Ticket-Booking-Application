package com.movie.app.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.movie.app.entity.Booking;

@Repository
public class CustomBookingRepositoryImpl implements CustomBookingRepository {
	
	@Autowired
	EntityManager entityManager;
	
	@SuppressWarnings("deprecation")
	@Override
	public List<Booking> getBookingsByTransactionId(int transactionId) {
		
		Session session = entityManager.unwrap(Session.class);
		// select * from AccountTable where cityName = 'dffd';
		String queryString1 = "from Booking a where a.transactionId=:transactionId";
		
		Query<Booking> query1 = session.createQuery(queryString1);
		query1.setLong("transactionId", transactionId);
		
		List<Booking>  list = (List<Booking>) query1.getResultList();
		
		// code to fetch data from DB using JPQL
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("Transaction Id Records Not In The Booking DataBase");
		}
	}

}
