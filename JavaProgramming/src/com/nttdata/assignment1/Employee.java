package com.nttdata.assignment1;

public class Employee {

	
	int empid;
	String empname;
	double salary;
	String location;
	public Employee(int empid, String empname, double salary, String location) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.location = location;
	}
	
	public String toString()
	{
		return "Employee [ empid= "+empid+"empname= "+empname+"salary= "+salary+"location= "+location+"]";
	}

	
}
