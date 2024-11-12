package com.infy.service;

import java.util.List;

import com.infy.dto.EmployeeDTO;
import com.infy.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;

	/*
		Write code to inject the bean employeeRepository with the help of constructor
	*/	

    // Constructor for dependency injection
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
	public void insert(EmployeeDTO employee) {
		employeeRepository.insertEmployee(employee);
	}

	public void delete(int empId) {
		employeeRepository.removeEmployee(empId);
	}
	
	public List<EmployeeDTO> getAllCustomer() {
		return employeeRepository.fetchCustomer();
	}


}
