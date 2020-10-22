package com.nttdata.Oops;

public class Bus extends Vehicle 
{
    Engine engine;
    
public Bus(int NoOfwheels, int noofseats,Engine engine)
{
	super(NoOfwheels,noofseats);
	this.engine=engine;
}
void display()
{
	System.out.println("Details of bus:");
	System.out.println("Wheels:"+NoOfwheels);
	System.out.println("No of seats:"+noofseats);
	System.out.println("Engine number:"+engine);
}


}

