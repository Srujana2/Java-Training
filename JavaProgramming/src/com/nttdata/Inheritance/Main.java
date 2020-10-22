package com.nttdata.Inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			Engine eg = new Engine("Electrical",1234);
			Car car = new Car(2, "i10",eg);
			car.displayCar();
			car.startVehicle(car);
			car.stopVehicle(car);

			
			Engine en = new Engine("Thermal",7890);
			Bus bus = new Bus(50, "White", en);
			bus.displayBus();
			bus.startVehicle(bus);
			bus.stopVehicle(bus);
			}
	}


