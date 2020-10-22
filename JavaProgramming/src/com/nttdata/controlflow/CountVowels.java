package com.nttdata.controlflow;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=100;
		System.out.println("Even numbers from 1 to 100 are:"+"\n");
		for (int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" ");
				
			}
		}
		System.out.println();
		System.out.println("Odd numbers from 1 to 100 are:");
		for(int j=1;j<=n;j++)
		{
			if(j%2!=0)
			{
				System.out.println(j+" ");
			}
		}
	}
}
