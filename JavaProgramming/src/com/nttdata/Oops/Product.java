package com.nttdata.Oops;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter to begin y/n:");
Scanner s=new Scanner(System.in);	
String value=s.next();

while(true)
{
	if(value.equals("y"))
	{
	ProductDetails p1=new ProductDetails();
p1.Product1();
p1.display();
	
System.out.println("Do you want to continue y/n:");
value=s.next();
	}
	else
	{
		System.out.println("Out");
		break;
	}
}

}

	private void display() {
		// TODO Auto-generated method stub
		
	}

	private void Product1() {
		// TODO Auto-generated method stub
		
	}
}