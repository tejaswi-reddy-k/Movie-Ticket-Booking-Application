package com.movie.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.app.entity.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

}