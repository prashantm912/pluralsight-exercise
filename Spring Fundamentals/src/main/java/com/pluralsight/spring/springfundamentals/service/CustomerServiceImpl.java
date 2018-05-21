package com.pluralsight.spring.springfundamentals.service;

import java.util.List;

import com.pluralsight.spring.springfundamentals.model.Customer;
import com.pluralsight.spring.springfundamentals.repository.CustomerRepository;
import com.pluralsight.spring.springfundamentals.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pluralsight.spring.springfundamentals.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.readAllCustomers();
	}
}
