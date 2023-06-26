package com.seleniumexpress.employee.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.seleniumexpress.employee.entity.Employee;
import com.seleniumexpress.employee.repo.EmployeeRepository;
import com.seleniumexpress.employee.response.EmployeeResponse;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public EmployeeResponse getEmployeeById(int id) {

		Employee employee = employeeRepository.findById(id).get();
		// converting employee to employeeResponse
		EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);
		System.out.println(" the employeeResponse" + employeeResponse);

		// System.out.println("Printing base url " +addressBaseURL);
		// using restTemplate for communicating with other service

		// AddressResponse addressResponse = restTemplate
		// .getForObject("http://localhost:8081/address-app/api/address/{id}",
		// AddressResponse.class, id);

		return employeeResponse;
	}

	// test method

	@Override
	public EmployeeResponse getEmployeeById321(int id) {

		Employee employee = employeeRepository.findById(id).get();
		// converting employee to employeeResponse
		EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);
		System.out.println(" the employeeResponse" + employeeResponse);

		// System.out.println("Printing base url " +addressBaseURL);
		// using restTemplate for communicating with other service

		// http://localhost:8081/address-app/api/address1221/1

		// AddressResponse addressResponse =

		// restTemplate.getForObject("http://localhost:8081/address-app/api/address1221/{id}",
		// AddressResponse.class, id);
		// AddressResponse addressResponse
		// =callingAddressServiceUsingRestTemplateNew(id);
//		employeeResponse.setAddressResponse(addressResponse);
		return employeeResponse;
	}

	// Communication Using Open Fient

//	@Override
//	public EmployeeResponse getEmployeeById(int id) {
//		
//		 Employee employee = employeeRepository.findById(id).get();
//		 //converting employee to employeeResponse
//		 EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);
//		 
//		 //using restTemplate for communicating with other service
//		// AddressResponse addressResponse = restTemplate.getForObject(addressBaseURL + "/address/{id}", AddressResponse.class, id);
//		// employeeResponse.setAddressResponse(addressResponse);
//		// return employeeResponse;
//		 ResponseEntity<AddressResponse> addressByEmployeeId = openFient.getAddressByEmployeeId(id);
//		 employeeResponse.setAddressResponse(addressByEmployeeId.getBody());
//		 return employeeResponse;
//		 
//	}

	/*
	 * @Override public void saveNewEmployee(EmployeeResponse empResponse) { // TODO
	 * Auto-generated method stub //Employee emp= new Employee(); Employee employee
	 * = modelMapper.map(empResponse, Employee.class);
	 * 
	 * 
	 * Employee employee=new Employee();
	 * employee.setEmployeeId(empResponse.getEmployeeId());
	 * employee.setEmployeeName(empResponse.getEmployeeName());
	 * employee.setEmail(empResponse.getEmail());
	 * employee.setBloodGroup(empResponse.getBloodGroup());
	 * 
	 * AddressResponse addressResponse = empResponse.getAddressResponse();
	 * addressResponse.setEmployeeId(empResponse.getEmployeeId());
	 * employeeRepository.save(employee); ResponseEntity<AddressResponse>
	 * postForEntity = restTemplate.postForEntity(
	 * "http://localhost:8081/address-app/api/saveAddress",addressResponse
	 * ,AddressResponse.class);
	 * System.out.println("checking postforentity"+postForEntity);
	 * 
	 * 
	 * 
	 * }
	 * 
	 * 
	 */

	@Override
	public List<Employee> findingAllEmployeeWihAddress() {

		List<Employee> findAllemployee = employeeRepository.findAll();

		return findAllemployee;
	}

	@Override
	public void saveNewEmployee(EmployeeResponse empResponse) {
		// TODO Auto-generated method stub

	}

}
