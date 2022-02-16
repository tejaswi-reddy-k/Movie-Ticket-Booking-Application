package com.movie.app.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.movie.app.entity.Customer;
import com.movie.app.repository.ICustomerRepository;
@SpringBootTest
class CustomerServiceImpTest {
	
    @Mock
    ICustomerRepository customerRepo;
    
	@Test
	void testViewCustomer() {
		Customer actualCustomer = new Customer();
		Optional<Customer> output = Optional.of(actualCustomer); 
		when((customerRepo.findById(1))).thenReturn(output);
		assertEquals(new Customer(), actualCustomer);
	}

	@Test
	void testViewAllCustomers() {
        List<Customer> actualOutput = new ArrayList<>();
        
        when(customerRepo.findAll()).thenReturn(actualOutput);
        // verify
        assertIterableEquals(new ArrayList<Customer>(), actualOutput);
	}

}
