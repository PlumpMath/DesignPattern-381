package com.wuxy13.pattern.facade.drive;

public class CarDriven {
	private CarSite carSite;
	private CarDoor carDoor;
	private CarKey carKey;
	private CarEngine carEngine;
	public CarDriven() {
		// TODO Auto-generated constructor stub
		carSite=new CarSite();
		carDoor=new CarDoor();
		carKey=new CarKey();
		carEngine=new CarEngine();
	}
	
	public void drive(){
		System.out.println("Car Drive Car");
		carSite.reach();
		carDoor.open();
		carKey.insert();
		carEngine.start();
	}
	
	public void finish(){
		System.out.println("Car Drive Finish");
		carEngine.end();
		carKey.remove();
		carDoor.close();
		carSite.leave();
	}
}
