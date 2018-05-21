package com.pluralsight.spring.springfundamentals.repository;

import java.util.List;

import com.pluralsight.spring.springfundamentals.model.Customer;

public interface CustomerRepository {

	public List<Customer> readAllCustomers();

}