package com.nttdata.controlflow;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="software";
String s2="waresoft";
String res="";
for(int i=0;i<s1.length();i++)
{
	for(int j=0;j<s1.length();j++)
	{
		if(s1.charAt(i)==s2.charAt(j))
		res+=s2.charAt(j);
	}
}
		System.out.println(res);
		if(res.compareTo(s1)==0)
			System.out.println("It is a anagram");
		else
			System.out.println("Not a anagram");
		
	}

}
