package com.nttdata.Files;

public class Employee {

	private static final long serialVersionUID=1L;
	
	transient int a;
	static int b;
	String name;
	int age;
	public Employee(int a, String name, int age) {
		super();
		this.a = a;
		this.name = name;
		this.age = age;
		//this.b=b;
	}
	
	void print(Employee e)
	{
		System.out.println("Transient value:"+e.a+"\t"+"Name:"+e.name+"\t"+"Age is:"+e.age);
	}
}
