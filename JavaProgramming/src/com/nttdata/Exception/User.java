package com.nttdata.Exception;

public class User {

 private String Username;

String Uname;
String Uaddress;
Account account;
public User( String uname, String uaddress, Account account) {
	super();
	Uname = uname;
	Uaddress = uaddress;
	this.account = account;
}

void display()
{
	System.out.println("User Name:"+Uname);
	System.out.println("User Address:"+Uaddress);
	System.out.println("Account Details are:");
	System.out.println("Account no:"+account.accNo);
	System.out.println("Balance Account:"+account.bal);
}
}

