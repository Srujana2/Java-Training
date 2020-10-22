package com.nttdata.Exception;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Account account=new Account(100,"hyd",1000);
		User u1=new User("Anu","Hyd",account);
		Bank b1=new Bank("SBI",1234,u1);
		System.out.println("Bank Details of Anu are:");
		b1.display();
		u1.display();
		System.out.println("Bank details of Tanu are:");
		Account account1=new Account(123,"Chennai",20000);
		User u2=new User("Tanu","Chennai",account1);
		Bank b2=new Bank("ICICI",1234,u2);
		u2.display();
		b2.display();
		
	System.out.println("1.Create your account   2.To do Transaction");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
		if(u1.account.bal>=a)
		{
			u1.account.bal=u1.account.bal-a;
			u2.account.bal=u2.account.bal+a;
			System.out.println("Successfully transferred");
			System.out.println("Anu balance:"+u1.account.bal);
			System.out.println("Tanu balance:"+u2.account.bal);	
		}
		else {
			System.out.println("Insufficient amount");
		}
	
	}
}
	


