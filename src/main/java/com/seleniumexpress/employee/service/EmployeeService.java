package com.seleniumexpress.employee.service;

import java.util.List;

import com.seleniumexpress.employee.entity.Employee;
import com.seleniumexpress.employee.response.EmployeeResponse;

public interface EmployeeService {

	public EmployeeResponse getEmployeeById(int id);

	//public EmployeeResponse callingAddressServiceUsingRestTemplate(int id);

	

	//public void saveNewEmployee(Employee emp);

	void saveNewEmployee(EmployeeResponse empResponse);
	
	List<Employee>  findingAllEmployeeWihAddress();
	
	//test method
	public EmployeeResponse getEmployeeById321(int id);
	
	
	
	
	

}
