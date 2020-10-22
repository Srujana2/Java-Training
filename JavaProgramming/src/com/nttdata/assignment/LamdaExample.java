package com.nttdata.assignment;

public class LamdaExample {

	
	void print()
	{
		System.out.println(" Hello ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  FunctionalInterface f=()->{System.out.println("Hello");};
   f.print();
}
	}


