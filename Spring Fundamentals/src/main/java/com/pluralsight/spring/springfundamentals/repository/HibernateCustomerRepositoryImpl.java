package com.pluralsight.spring.springfundamentals.repository;

import java.util.Arrays;
import java.util.List;

import com.pluralsight.spring.springfundamentals.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pluralsight.spring.springfundamentals.repository.CustomerRepository#
	 * readAllCustomers()
	 */
	@Override
	public List<Customer> readAllCustomers() {
		Customer customer = new Customer();
		customer.setFirstName("Prashant");
		customer.setLastName("Madhavi");

		return Arrays.asList(customer);
	}
}
