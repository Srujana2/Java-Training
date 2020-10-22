package com.nttdata.Collections;

public class Bank {
private String Bankname;
Account account;
public Bank(String bankname, Account account) {
	super();
	Bankname = bankname;
	this.account = account;
}
public String getBankname() {
	return Bankname;
}
public void setBankname(String bankname) {
	Bankname = bankname;
}
public Account getAccount() {
	return account;
}
public void setAccount(Account account) {
	this.account = account;
}

void display()
{
	System.out.println("Bank details:");
	System.out.println("Bank name:"+Bankname);
	System.out.println("Account id:"+account.getAccountId());
	System.out.println("Account Name:"+account.getName());
	System.out.println("Account Balance:"+account.getBalance());
}
}
