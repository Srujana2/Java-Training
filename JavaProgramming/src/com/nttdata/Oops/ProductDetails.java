package com.nttdata.Oops;

import java.util.Scanner;

public class ProductDetails {

int ProductId;
String Productname;

public void Product1()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter product details:");
	System.out.println("Enter productId:");
	ProductId=sc.nextInt();
	System.out.println("Enter productName:");
	Productname=sc.next();
	
}
	void display()
	{
		System.out.println("The product details are:");
		System.out.println("ProductId: " +ProductId+" ProductName: " +Productname);
	}
	
}
