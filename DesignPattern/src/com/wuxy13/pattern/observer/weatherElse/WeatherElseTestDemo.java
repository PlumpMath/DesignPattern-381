package com.wuxy13.pattern.observer.weatherElse;


import java.util.Observer;

import com.wuxy13.pattern.observer.weatherElse.observer.CurrentConditions;
import com.wuxy13.pattern.observer.weatherElse.observer.MediumConditions;
import com.wuxy13.pattern.observer.weatherElse.subject.WeatherDataElse;

public class WeatherElseTestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherDataElse wd=new WeatherDataElse();
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
