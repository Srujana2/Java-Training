package com.nttdata.Oops;

public class Customer {

	String customerName;
	String customerAddress;
	
	
	public Customer(String customerName, String customerAddress) {
		super();
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}
	
	
	public void display()
	{
		System.out.println("The details of the customer:");
		System.out.println( "CustomerName: "+customerName+" customerAddress: "+customerAddress);
	}
}
