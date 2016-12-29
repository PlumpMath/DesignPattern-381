package com.wuxy13.pattern.observer.weather.observer;

import com.wuxy13.pattern.observer.weather.subject.Subject;

public class MediumConditions implements Observer, DisplayElement {
	private float maxTemperature;
	private float maxPressure;
	private Subject subject;
	
	public MediumConditions(Subject subject) {
		// TODO Auto-generated constructor stub
		this.subject=subject;
		subject.registerObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("*****************");
		System.out.println("MediumConditions");
		System.out.println("Temperature:"+maxTemperature+"|Pressure:"+maxPressure);
		System.out.println("*****************");

	}

	@Override
	public void update(float temprature, float pressure) {
		// TODO Auto-generated method stub
		if(temprature>this.maxTemperature){
			maxTemperature=temprature;
		}
		if(pressure>this.maxPressure){
			maxPressure=pressure;
		}
		display();
	}

}
