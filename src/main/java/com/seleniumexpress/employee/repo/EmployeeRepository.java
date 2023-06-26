package com.seleniumexpress.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seleniumexpress.employee.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
	
	
}
