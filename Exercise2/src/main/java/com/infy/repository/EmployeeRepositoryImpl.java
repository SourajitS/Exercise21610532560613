package com.infy.repository;

import java.util.ArrayList;
import java.util.List;


import com.infy.dto.EmployeeDTO;

public class EmployeeRepositoryImpl implements EmployeeRepository  {
		List<EmployeeDTO> employee =  new ArrayList<EmployeeDTO>();		
		{
			EmployeeDTO emp1 = new EmployeeDTO();
			emp1.setEmpId(10301);
			emp1.setName("Daniel");
			emp1.setDepartment("IT-Digital");
			employee.add(emp1);
			
			EmployeeDTO emp2 = new EmployeeDTO();
			emp2.setEmpId(10302);
			emp2.setName("Peter");
			emp2.setDepartment("Accounts");
			employee.add(emp2);
			
			EmployeeDTO emp3 = new EmployeeDTO();
			emp3.setEmpId(10303);
			emp3.setName("Anna");
			emp3.setDepartment("IT-Support");
			employee.add(emp3);
			
			EmployeeDTO emp4 = new EmployeeDTO();
			emp4.setEmpId(10304);
			emp4.setName("Lousie");
			emp4.setDepartment("Marketing");
			employee.add(emp4);
		}
		
		public void insertEmployee(EmployeeDTO emp) {
			employee.add(emp);
			System.out.println("Employee:"+emp.getEmpId()+" added successfully");
		}
		
//		public void removeEmployee(int empId) {
//			int index=0;
//			for (int i=0; i<employee.size();i++) {
//				if(employee.get(i).getEmpId() == empId) {
//					index = i;
//				}
//			}
//			EmployeeDTO emp = employee.remove(index);
//			System.out.println("Employee:"+emp.getEmpId()+" removed successfully");
//			
//		}
		
		public void removeEmployee(int empId) {
		    boolean found = false; // Flag to check if the employee was found
		    int index = -1; // Initialize index to -1 to indicate not found
		    
		    for (int i = 0; i < employee.size(); i++) {
		        if (employee.get(i).getEmpId() == empId) {
		            index = i; // Update index to the found employee's index
		            found = true; // Set found to true
		            break; // Exit loop since we found the employee
		        }
		    }
		    
		    if (found && index != -1) {
		        EmployeeDTO emp = employee.remove(index);
		        System.out.println("Employee:" + emp.getEmpId() + " removed successfully");
		    } else {
		        System.out.println("Employee with ID " + empId + " not found.");
		    }
		}
		
		public List<EmployeeDTO> fetchCustomer() {
			return employee;
		}
	}

