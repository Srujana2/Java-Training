package com.nttdata.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {

	List<Bank> list =new ArrayList<>();
	public void transaction(int sender,int receiver,double transfer)throws Exception
	{
		for(int i=0;i<=list.size()-1;i++)
		{
			if(list.get(i).account.getAccountId()==sender)
			{
			if(list.get(i).account.getBalance()<transfer)
			{
				throw new Exception("Invalid transfer amount");
			}
			else
			{
				
				list.get(i).account.setBalance(list.get(i).account.getBalance()-transfer);
			}
			break;
		}
		else
		{
			System.out.println("sender not found");
		}
		if(list.get(i).account.getAccountId()==receiver)
		{
			list.get(i).account.setBalance(list.get(i).account.getBalance()+transfer);
			break;
		}
		else
		{
			System.out.println("receiver not found");
		}
	}
		System.out.println("after transaction......................");
}
	public void createObject()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the bank details");
		System.out.println("Enter Bank Id:");
		int id=sc.nextInt();
		System.out.println("Enter the name of account holder");
		String num=sc.next();
		System.out.println("Enter Balance");
		double bal=sc.nextDouble();
		System.out.println("Enter Bank name");
		String bname=sc.next();
		Account account=new Account(id,num,bal);
		list.add(new Bank(bname,account));
	}
	public void display2() {
		// TODO Auto-generated method stub
		
	}
}