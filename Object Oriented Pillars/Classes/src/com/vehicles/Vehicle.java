package com.vehicles;


public class Vehicle {
	public static void main(String[] args) {
		Car Mazda = new Car("closed","on","seated",15);
		Car kia = new Car("open","off","seated",0);

		System.out.println(Mazda.run());
		System.out.println(kia.run());
	}
}
