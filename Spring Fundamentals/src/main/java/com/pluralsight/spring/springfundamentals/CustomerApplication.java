package com.pluralsight.spring.springfundamentals;

import com.pluralsight.spring.springfundamentals.service.CustomerService;
import com.pluralsight.spring.springfundamentals.service.CustomerServiceImpl;

public class CustomerApplication {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerServiceImpl();
		System.out.println(customerService.findAll().get(0).getFirstName());
		System.out.println(customerService.findAll().get(0).getLastName());
	}
}
