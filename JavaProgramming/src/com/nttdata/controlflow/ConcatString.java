package com.nttdata.controlflow;

public class ConcatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Hi";
		String s2="mom";
		String s3=s1+s2;
		System.out.println(s3);
		
		StringBuffer s4=new StringBuffer("Hi");
		StringBuffer s5=new StringBuffer("mom");
		StringBuffer s6=s4.append(s5);
		System.out.println(s6);
	}

}
