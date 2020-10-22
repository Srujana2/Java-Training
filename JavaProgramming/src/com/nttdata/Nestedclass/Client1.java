package com.nttdata.Nestedclass;

public class Client1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Product p1=new Product("android");
		
		try
		{
		Product p2=(Product)p1.clone();
		System.out.println("Clone1:"+p2.productname);
		Product p3=(Product)p1.clone();
		System.out.println("Clone2:"+p3.productname);
		Product p4=(Product)p1.clone();
		System.out.println("Clone3:"+p4.productname);
		}
	
		catch(CloneNotSupportedException e)
		{
			System.out.println(e);
		}
	}

}
