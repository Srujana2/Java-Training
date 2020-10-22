package com.nttdata.controlflow;

public class Initials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Srujana Reddy Eguram";
StringBuffer myName=new StringBuffer();
int len=name.length();
for(int i=0;i<len;i++)
{
	if(Character.isUpperCase(name.charAt(i)))
	{
	myName.append(name.charAt(i));
}
	}
	System.out.println("myName:"+myName);
}
}