package com.seleniumexpress.employee.response;

import java.util.List;

import org.springframework.http.ResponseEntity;

public class EmployeeResponse {

	private int empId;
	private String empName;
	private String bloogGroup;
	private String email;
	private List<ResponseEntity<AddressResponse[]>> addressResponse;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getBloogGroup() {
		return bloogGroup;
	}
	public void setBloogGroup(String bloogGroup) {
		this.bloogGroup = bloogGroup;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<ResponseEntity<AddressResponse[]>> getAddressResponse() {
		return addressResponse;
	}
	public void setAddressResponse(List<ResponseEntity<AddressResponse[]>> addressResponse) {
		this.addressResponse = addressResponse;
	}
	
	
	

	

}
