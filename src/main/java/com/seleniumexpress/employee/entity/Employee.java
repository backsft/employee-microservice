package com.seleniumexpress.employee.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "employee")
@Entity
public class Employee {

	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)

	private int empId;
	private String empName;
	private String bloogGroup;
	private String email;
	

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

	public Employee(int empId, String empName, String bloogGroup, String email) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.bloogGroup = bloogGroup;
		this.email = email;
	}

	public Employee() {

	}

}
