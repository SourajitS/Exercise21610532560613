package com.infy.service;

import java.util.List;

import com.infy.dto.EmployeeDTO;

public interface EmployeeService {

	public void insert(EmployeeDTO employee);
	
	public void delete(int empId);
	
	public List<EmployeeDTO> getAllCustomer();

}