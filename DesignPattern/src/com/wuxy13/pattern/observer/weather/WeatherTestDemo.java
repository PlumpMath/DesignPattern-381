package com.wuxy13.pattern.observer.weather;

import com.wuxy13.pattern.observer.weather.observer.CurrentConditions;
import com.wuxy13.pattern.observer.weather.observer.MediumConditions;
import com.wuxy13.pattern.observer.weather.observer.Observer;
import com.wuxy13.pattern.observer.weather.subject.Subject;
import com.wuxy13.pattern.observer.weather.subject.WeatherData;

public class WeatherTestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData wd=new WeatherData();
		Observer o1=new CurrentConditions(wd);
		Observer o2=new MediumConditions(wd);
		System.out.println("Initialize");
		wd.setMeasurement(20, 100);
		System.out.println("Changed");
		wd.setMeasurement(19, 101);
		System.out.println("Changed");
		wd.setMeasurement(30, 99);
		
	}

}
