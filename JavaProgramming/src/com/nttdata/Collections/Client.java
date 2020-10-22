package com.nttdata.Collections;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int choice;
int senderid;
int receiverid;
double transferAmount;
User user=new User();

do
{
	System.out.println("welcome to sbi");
	System.out.println("press 1 for create account"+"\tb"+"press 2 for transaction");
	int n=sc.nextInt();
	switch(n)
	{
	case 1:
		user.createObject();
		System.out.println("successfully created");
		break;
	case 2:
		System.out.println("before transaction");
		user.display2();
	}
}
	}

}
