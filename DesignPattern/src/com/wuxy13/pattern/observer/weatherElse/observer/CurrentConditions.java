package com.wuxy13.pattern.observer.weatherElse.observer;

import java.util.Observable;
import java.util.Observer;
import com.wuxy13.pattern.observer.weather.subject.WeatherData;
import com.wuxy13.pattern.observer.weatherElse.subject.WeatherDataElse;

public class CurrentConditions implements DisplayElement, Observer {
	private float temperature;
	private float pressure;
	private Observable observable;
	
	public CurrentConditions(Observable observable) {
		// TODO Auto-generated constructor stub
		this.observable=observable;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		WeatherDataElse wd=(WeatherDataElse)o;
		this.temperature=wd.getTemperature();
		this.pressure=wd.getPressure();
		display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("*****************");
		System.out.println("CurrentConditions");
		System.out.println("Temperature:"+temperature+"|Pressure:"+pressure);
		System.out.println("*****************");
	}

}
