package com.nttdata.Inheritance;

import java.util.Scanner;

public class Employee {

	
	int id;
	String name;
	String address;
	double salary;
	long phno;
	void EmpDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee details:");
		System.out.println("Enter employee id:");
		id=sc.nextInt();
		System.out.println("Enter employee name:");
		name=sc.next();
		System.out.println("Enter employee address:");
		address=sc.next();
		System.out.println("Enter Phone number:");
		phno=sc.nextLong();
	}
	
	void display()
	{
		System.out.println("Employee Details are:");
		System.out.println("Employee id:"+id);
		System.out.println("Employee name:"+name);
        System.out.println("Employee address:"+address);
        System.out.println("Employee phone number:"+phno);
	}
}
