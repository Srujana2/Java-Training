package com.nttdata.Exception;

import java.util.Scanner;

public class Bank {

	 String bankName;
		int bankCode;
		User user;
		public Bank(String bankName, int bankCode, User user) {
			super();
			this.bankName = bankName;
			this.bankCode = bankCode;
			this.user = user;
		}
		void display()
		{
			System.out.println("Bank Name:"+bankName);
			System.out.println("Bank Code:"+bankCode);
		}
}
