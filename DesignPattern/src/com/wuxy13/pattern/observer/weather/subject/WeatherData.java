package com.wuxy13.pattern.observer.weather.subject;

import java.util.ArrayList;

import com.wuxy13.pattern.observer.weather.observer.Observer;

public class WeatherData implements Subject {
	
	private ArrayList<Observer> observers;
	private float temperature;
	private float pressure;
	
	public WeatherData() {
		// TODO Auto-generated constructor stub
		observers=new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int index=observers.indexOf(o);
		if(index>-1){
			observers.remove(index);
		}
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer o : observers) {
			o.update(temperature,pressure);
		}
	}
	
	public void measurementChanged(){
		notifyObservers();
	}
	
	public void setMeasurement(float temperature,float pressure){
		this.temperature=temperature;
		this.pressure=pressure;
		measurementChanged();
	}

}
