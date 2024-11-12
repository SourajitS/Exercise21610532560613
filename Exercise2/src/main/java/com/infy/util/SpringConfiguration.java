package com.infy.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infy.repository.EmployeeRepository;
import com.infy.repository.EmployeeRepositoryImpl;
import com.infy.service.EmployeeService;
import com.infy.service.EmployeeServiceImpl;

@Configuration
public class SpringConfiguration {
	
	/*
		Create required beans here: 1. employeeRepository 2.employeeService
	*/
	
	@Bean
    public EmployeeRepository employeeRepository() {
        return new EmployeeRepositoryImpl(); // or whatever implementation you have
    }

    @Bean
    public EmployeeService employeeService() {
        return new EmployeeServiceImpl(employeeRepository());
    }
	
}
