package com.nttdata.Exception;

public class Account {
	int accNo;
	double bal;
	String accAddress;
	public Account(int accNo,String accAddress, double bal)
	{
		super();
		this.accNo = accNo;
		this.bal =bal ;
		this.accAddress=accAddress;
	}
}
