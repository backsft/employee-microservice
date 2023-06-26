package com.seleniumexpress.employee.controller;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.seleniumexpress.employee.entity.Employee;
import com.seleniumexpress.employee.repo.EmployeeRepository;
import com.seleniumexpress.employee.response.AddressResponse;
import com.seleniumexpress.employee.response.EmployeeResponse;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ModelMapper modelMapper;

	@Autowired

	RestTemplate restTemplate;

	// test method for calling only employee information

	@GetMapping("/employee/{employeeId}")
	public EmployeeResponse onlyemployee(@PathVariable int employeeId) {

		Optional<Employee> findById = employeeRepository.findById(employeeId);
		Employee employee = findById.get();
		EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);

		return employeeResponse;
	}

	// test method for calling Adress microservices using rest template and merging
	// all the data using employeeresponse

	@GetMapping("/employeewithadress/{employeeId}")
	public EmployeeResponse employeewithAdress(@PathVariable int employeeId) {

		Optional<Employee> findById = employeeRepository.findById(employeeId);

		Employee employee = findById.get();
		EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);

		List<ResponseEntity<AddressResponse[]>> responseEntity =Arrays.asList(restTemplate.getForEntity("http://localhost:8081/address-app/api/address/{employeeId}", AddressResponse[].class, employeeId)); 
		
		
		
		employeeResponse.setAddressResponse(responseEntity);
		
		System.out.println("testing"+employeeResponse);
		return employeeResponse;

	}

}
