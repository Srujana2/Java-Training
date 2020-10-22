package com.nttdata.Collections;

public class Employee {

	private int EmpId;
	private String empName;
	private String address;
	public Employee(int empId, String empName, String address) {
		super();
		EmpId = empId;
		this.empName = empName;
		this.address = address;
	}
	
	public String toString()
	{
		return "Employee [empId="+EmpId+",empName="+empName+",address="+address+ "]";
		
				
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
