package com.nttdata.Oops;

public class Car extends Vehicle {

	
	Engine engine;
    
	public Car(int noOfwheels, int noofseats,Engine engine) {
		
		super(noOfwheels, noofseats);
		this.engine=engine;
	}
	void display()
	{
		System.out.println("Details of Car:");
		System.out.println("Wheels:"+NoOfwheels);
		System.out.println("No of seats:"+noofseats);
		System.out.println("Engine number:"+engine);
	}
	
}
