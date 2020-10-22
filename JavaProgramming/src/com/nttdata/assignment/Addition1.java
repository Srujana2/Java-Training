package com.nttdata.assignment;

import java.util.function.BiFunction;

public class Addition1 {

	
	static int add(int a,int b)
	{
		return a+b;
	}
	
	static float add1(int a,float b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BiFunction<Integer,Integer,Integer> add=Addition1::add;
int res=add.apply(10, 20);
System.out.println(res);

BiFunction<Integer,Float,Float> add1=Addition1::add1;
float res1=add1.apply(20,12.98f);
System.out.println(res1);
	}

}
