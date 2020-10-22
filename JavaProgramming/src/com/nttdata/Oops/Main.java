package com.nttdata.Oops;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bus bus=new Bus(1,20,new Engine(10,"128CC"));
		Car car=new Car(2,4,new Engine(12,"128CC"));
		bus.display();
		car.display();
	}

}
