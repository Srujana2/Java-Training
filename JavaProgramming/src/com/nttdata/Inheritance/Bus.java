package com.nttdata.Inheritance;

public class Bus implements Vehicle{

	int noOfSeats;
	String color;
	Engine engine;

	public Bus(int noOfSeats, String color, Engine engine) {
	super();
	this.noOfSeats = noOfSeats;
	this.color = color;
	this.engine = engine;
	}

	@Override
	public void startVehicle(Vehicle vehicle) {

	System.out.println("-------Bus has Started------");
	}

	@Override
	public void stopVehicle(Vehicle vehicle) {

	System.out.println("-------Bus has Stopped-------");
	}

	public void displayBus()
	{

	   System.out.println("");
	    System.out.println("**********Bus Details:************");
	    System.out.println(" Color:"+color+"\t No.of Seats:"+noOfSeats);
	    engine.engineDisplay();
	}

	
}
