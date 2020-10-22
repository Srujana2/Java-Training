package com.nttdata.Nestedclass;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Debitcard obj=new Debitcard(100,"srujana",20);
		//((Debitcard) obj).setHoldername("srujana");
		Debitcard.Account ac=obj.new Account(250,2000,12);
		boolean b=ac.validateDebitcard(12,"srujana");
	
		if(b==true) {
			System.out.println("Your credentials are successfully validated");
		}
		else
		{
			System.out.println("You have entered incorrect credentials");
		}
	}

}
