package com.nttdata.Exception;

import java.util.Scanner;

public class Assertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no:");
		int value=sc.nextInt();
		assert value<=0:"its invalid no";
		System.out.println(value);
	}
}
