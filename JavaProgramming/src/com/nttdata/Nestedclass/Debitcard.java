package com.nttdata.Nestedclass;

public class Debitcard {

	
	private int cardnumber;
	private String holdername;
	private int cvv;
	
	public Debitcard(int cardnumber, String holdername, int cvv) {
		super();
		this.cardnumber = cardnumber;
		this.holdername = holdername;
		this.cvv = cvv;
	}
	public int getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(int cardnumber) {
		this.cardnumber = cardnumber;
	}
	public String getHoldername() {
		return holdername;
	}
	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	class Account
	{
		private int Accountno;
		private double balance;
		private int pin;
		
		
		public Account(int accountno, double balance, int pin) 
		{
			super();
			Accountno = accountno;
			this.balance = balance;
			this.pin = pin;
		}
		
		
		
		boolean validateDebitcard(int pin,String hm)
		{
			if(this.pin==pin&&holdername.equals(hm))
			{
			return true;
			
		}
			else
				return false;
	}

	}
}