package com.movie.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.app.entity.Customer;
import com.movie.app.exceptions.CustomerNotFoundException;
import com.movie.app.repository.ICustomerRepository;
@Service
public class CustomerServiceImp implements ICustomerService {
	@Autowired
	private ICustomerRepository customerRepo;

	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepo.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) throws CustomerNotFoundException {
		return customerRepo.save(customer);
	}

	@Override
	public void deleteCustomer(int custid) {
		customerRepo.deleteById(custid);
	}
	
	@Override
	public Customer viewCustomer(int custid) throws CustomerNotFoundException {
		return customerRepo.findById(custid).get();
	}


	@Override
	public List<Customer> viewAllCustomers() {
		return customerRepo.findAll();
	}

}
