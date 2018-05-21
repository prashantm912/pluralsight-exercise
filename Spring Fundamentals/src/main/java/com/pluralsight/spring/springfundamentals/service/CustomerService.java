package com.pluralsight.spring.springfundamentals.service;

import java.util.List;

import com.pluralsight.spring.springfundamentals.model.Customer;

public interface CustomerService {

	public List<Customer> findAll();

}