package com.wuxy13.pattern.observer.weather.observer;

import com.wuxy13.pattern.observer.weather.subject.Subject;

public class CurrentConditions implements Observer, DisplayElement {
	private float temperature;
	private float pressure;
	private Subject subject;
	
	public CurrentConditions(Subject subject) {
		// TODO Auto-generated constructor stub
		this.subject=subject;
		subject.registerObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("*****************");
		System.out.println("CurrentConditions");
		System.out.println("Temperature:"+temperature+"|Pressure:"+pressure);
		System.out.println("*****************");
	}

	@Override
	public void update(float temprature, float pressure) {
		// TODO Auto-generated method stub
		this.temperature=temprature;
		this.pressure=pressure;
		display();
	}

}
