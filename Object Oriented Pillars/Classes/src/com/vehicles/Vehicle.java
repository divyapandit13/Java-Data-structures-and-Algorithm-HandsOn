package com.vehicles;


public class Vehicle {
	public static void main(String[] args) {
    Car Mazda = new Car();
	Mazda.setDoors("closed");
	Mazda.setEngine("on");
	Mazda.setDriver("seated");
	Mazda.setSpeed(15);
	
	System.out.println(Mazda.run());
	}
}
