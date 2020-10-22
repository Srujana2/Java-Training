package com.nttdata.controlflow;

public class EvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=100;
		System.out.println("Even numbers from 1 to 100 are:");
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even numbers" +i+"");
			}
			else if(i%2!=0)
			{
				int j=i;
				System.out.println("Odd numbers:"+j+" ");
			}
				
		}
	}

}
