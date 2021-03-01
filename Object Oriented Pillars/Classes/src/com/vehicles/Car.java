package com.vehicles;



public class Car extends Vehicle {
	private String doors;
	private String engine;
	private String driver;
	private int speed;




	public Car(String doors, String engine, String driver, int speed) {

		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}

	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String run() {

		if(doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed>0) {
			return "Car is running";
		}
		else {
			return "Car is not running";

		}
	}
	@Override
	public String toString() {
		return "Car [doors=" + doors + ", engine=" + engine + ", driver=" + driver + ", speed=" + speed + "]";
	}





}
