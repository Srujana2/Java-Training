package com.nttdata.Inheritance;

public class Car implements Vehicle{

	
	int noOfAirbags;
	String brand;
	Engine engine;

	public Car(int noOfAirbags, String brand, Engine engine) {
	super();
	this.noOfAirbags = noOfAirbags;
	this.brand = brand;
	this.engine = engine;
	}

	@Override
	public void startVehicle(Vehicle vehicle) {

	System.out.println("------Car has Started-------");
	}

	@Override
	public void stopVehicle(Vehicle vehicle) {

	System.out.println("------Car has Stopped-------");

	}
	 public void displayCar()
	   {
	   System.out.println("");
	   System.out.println("**********Car Details:************");
	    System.out.println(" Brand:"+brand+"\t No.of Air Bags:"+noOfAirbags);
	    engine.engineDisplay();
	   
	   }

	}


