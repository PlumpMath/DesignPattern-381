package com.wuxy13.pattern.observer.weatherElse.subject;

import java.util.Observable;

public class WeatherDataElse extends Observable {
	private float temperature;
	private float pressure;
	
	public float getTemperature() {
		return temperature;
	}
	public float getPressure() {
		return pressure;
	}
	
	public void measurementChanged(){
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurement(float temperature,float pressure){
		this.temperature=temperature;
		this.pressure=pressure;
		measurementChanged();
		}
}
