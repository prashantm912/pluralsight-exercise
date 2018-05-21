package com.pluralsight.spring.springfundamentals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.spring.springfundamentals.service.CustomerService;

public class CustomerApplication {

	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);
		//CustomerService customerService = new CustomerServiceImpl();
		System.out.println(customerService.findAll().get(0).getFirstName());
		System.out.println(customerService.findAll().get(0).getLastName());
	}
}
