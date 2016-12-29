package com.wuxy13.pattern.observer.weatherElse.observer;

import java.util.Observable;
import java.util.Observer;

import com.wuxy13.pattern.observer.weather.subject.WeatherData;
import com.wuxy13.pattern.observer.weatherElse.subject.WeatherDataElse;

public class MediumConditions implements Observer, DisplayElement {
	private float maxTemperature;
	private float maxPressure;
	private Observable observable;

	public MediumConditions(Observable o) {
		// TODO Auto-generated constructor stub
		this.observable=o;
		o.addObserver(this);
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
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		WeatherDataElse wd=(WeatherDataElse)o;
		if(wd.getTemperature()>this.maxTemperature){
			maxTemperature=wd.getTemperature();
		}
		if(wd.getPressure()>this.maxPressure){
			maxPressure=wd.getPressure();
		}
		display();
	}

}
