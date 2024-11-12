package com.infy;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.infy.dto.EmployeeDTO;
import com.infy.service.EmployeeServiceImpl;
import com.infy.util.SpringConfiguration;

public class Client 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        
        EmployeeServiceImpl service = (EmployeeServiceImpl) context.getBean("employeeService");
//        EmployeeServiceImpl serviceNew = context.getBean(EmployeeServiceImpl.class);
        EmployeeDTO emp = new EmployeeDTO();
        emp.setDepartment("IT-Support");
        emp.setEmpId(10309);
        emp.setName("Mathew");
        
        service.insert(emp);
        List<EmployeeDTO> list = service.getAllCustomer();
        for (EmployeeDTO employeeDTO : list) {
			System.out.println(employeeDTO.getEmpId()+" - "+employeeDTO.getName()+" - "+employeeDTO.getDepartment());
		}
        service.delete(103010);

        context.close();
        
    }
}
