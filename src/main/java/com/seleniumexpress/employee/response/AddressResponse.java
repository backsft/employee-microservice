package com.seleniumexpress.employee.response;

public class AddressResponse {

	private int addressId;	
	private long zip;		
	private String state;
	private int empId;
	
	
	
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public AddressResponse(int addressId, long zip, String state, int empId) {
		super();
		this.addressId = addressId;
		this.zip = zip;
		this.state = state;
		this.empId = empId;
	}
	public AddressResponse() {
		
	}


}
