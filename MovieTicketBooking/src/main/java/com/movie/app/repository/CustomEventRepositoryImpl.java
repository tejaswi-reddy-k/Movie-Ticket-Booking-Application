package com.movie.app.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.movie.app.entity.Event;

@Repository
public class CustomEventRepositoryImpl implements CustomEventRepository {
	
	@Autowired
	EntityManager entityManager;
	
	@SuppressWarnings("deprecation")
	@Override
	public List<Event> getEventsByType(String eventType) {
		
		Session session = entityManager.unwrap(Session.class);
		// select * from AccountTable where cityName = 'dffd';
		String queryString1 = "from Event a where a.eventType=:eventType";
		
		Query<Event> query1 = session.createQuery(queryString1);
		query1.setString("cityName", eventType);
		
		List<Event>  list = (List<Event>) query1.getResultList();
		
		// code to fetch data from DB using JPQL
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("Event Type Records Not In The DataBase");
		}
	}
	
	
	@SuppressWarnings("deprecation")
	@Override
	public List<Event> getEventsByLanguage(String eventLanguage) {
		
		Session session = entityManager.unwrap(Session.class);
		// select * from AccountTable where cityName = 'dffd';
		String queryString2 = "from Event a where a.eventLanguage=:eventLanguage";
		
		Query<Event> query2 = session.createQuery(queryString2);
		query2.setString("eventLanguage", eventLanguage);
		
		List<Event>  list = (List<Event>) query2.getResultList();
		
		// code to fetch data from DB using JPQL
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("Event Language Records Not In The DataBase");
		}
	}


}
