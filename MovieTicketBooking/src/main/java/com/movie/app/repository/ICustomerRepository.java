package com.movie.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.movie.app.entity.Customer;

@Repository
public interface ICustomerRepository extends CrudRepository<Customer, Integer> {

	
}