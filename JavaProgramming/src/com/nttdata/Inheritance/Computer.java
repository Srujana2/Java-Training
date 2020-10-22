package com.nttdata.Inheritance;

public class Computer extends ElectronicDevices {
	
	MotherBoard motherboard;
    String mbModel;
    
    public Computer(String model, double cost, String colour,MotherBoard motherboard,String mbModel)
    {
    	super(model,cost,colour);
    	this.motherboard=motherboard;
    	this.mbModel=mbModel;
    }
    void display()
    {
    	System.out.println("Computer cost:"+cost);
    	System.out.println("Computer model:"+model);
    	System.out.println("Computer colour:"+colour);
    	System.out.println("Computer ram:"+motherboard.ramsize);
    	System.out.println("Computer motherboard model:"+mbModel);
    }

}
