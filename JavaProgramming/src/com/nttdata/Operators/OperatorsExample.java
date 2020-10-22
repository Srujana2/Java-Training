package com.nttdata.Operators;

public class OperatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int i=10;
	int n=i++%5;
	System.out.println("Value of i:"+i);
	System.out.println("Value of n:"+n);
	
	int n1=++i%5;
	System.out.println("Value of i and n1 " +i+" "+n1 );
	
	int i1=8;
	System.out.println("Original i2:"+Integer.toBinaryString(i1));
	i1>>=2;
	System.out.println("Shiftright of i2:"+Integer.toBinaryString(i1));
	
	int i2=17;
	System.out.println("Original i2:"+Integer.toBinaryString(i2));
	i2>>=1;
	System.out.println("Shiftright of i2:"+Integer.toBinaryString(i2));
	}

}
