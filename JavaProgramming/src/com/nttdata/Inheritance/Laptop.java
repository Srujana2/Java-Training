package com.nttdata.Inheritance;

public class Laptop  extends ElectronicDevices{

	MotherBoard motherboard;
	String IModel;
	
	
	public Laptop(String model, double cost, String colour,MotherBoard motherboard,String IModel) 
	{
		super(model, cost, colour);
		this.motherboard=motherboard;
		this.IModel=IModel;
		// TODO Auto-generated constructor stub
	}
void display()
{
	System.out.println("Laptop cost:"+cost);
	System.out.println("Laptop model:"+model);
	System.out.println("Laptop colour:"+colour);
	System.out.println("Laptop ram:"+motherboard.ramsize);
	System.out.println("Laptop motherboard model:"+IModel);
}
}
