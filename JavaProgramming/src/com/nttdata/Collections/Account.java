package com.nttdata.Collections;

public class Account {
int AccountId;
String name;
double balance;
public Account(int accountId, String name, double balance) {
	super();
	AccountId = accountId;
	this.name = name;
	this.balance = balance;
}
public int getAccountId() {
	return AccountId;
}
public void setAccountId(int accountId) {
	AccountId = accountId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}


}
