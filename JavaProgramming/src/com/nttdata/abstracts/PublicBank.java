package com.nttdata.abstracts;

import java.util.Scanner;

import com.nttdata.Exception.User;

public class PublicBank extends Bank implements RBI{

	
	//private String bankType;

	public PublicBank(String bankName, int bankCode, User user) {
		super(bankName, bankCode, user);
		// TODO Auto-generated constructor stub
	}

	private String bankType;
	private double loanInterestRate;
	Account account;
	double interest;
	
	@Override
	public void loanInterestCal() {
		
		interest = loanInterestRate*account.balance;
	}
	
	public void displayPublicBank()
	{
		System.out.println("Public Bank Details:");
		inputBank();
		System.out.println("Enter Bank Type:");
		Scanner sc = new Scanner(System.in);
		bankType = sc.next();
		System.out.println("Enter Loan Interest Rate:");
		loanInterestRate = sc.nextDouble();
		System.out.println("Enter Account Id:");
		account.accId = sc.nextInt();
		System.out.println("Enter Balance:");
		account.balance = sc.nextDouble();
		//account.inputAccount();
		displayBank();
		System.out.println("Bank Type:"+bankType+"\t Loan Interest Rate:"+loanInterestRate);
		System.out.println("Interest:"+interest);
	}
	
	
}

