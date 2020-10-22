package com.nttdata.assignment1;

public class Customer {

	
	int id;
	String custname;
	String password;
	double totalprice;
	String city;
	public Customer(int id, String custname, String password, double totalprice, String city) {
		super();
		this.id = id;
		this.custname = custname;
		this.password = password;
		this.totalprice = totalprice;
		this.city = city;
	}
	
	public String toString()
	{
		return "Customer[id="+id+"custname="+custname+"password="+password+"totalprice="+totalprice+"city"+city+"]";
	}
	
	
}
