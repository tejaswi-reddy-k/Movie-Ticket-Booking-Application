package com.movie.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movie.app.entity.Customer;
import com.movie.app.exceptions.CustomerNotFoundException;
@Service
public interface ICustomerService {
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer) throws CustomerNotFoundException;
	public Customer viewCustomer(int custid) throws CustomerNotFoundException;
	public List<Customer> viewAllCustomers();
	public void deleteCustomer(int custid);

}
