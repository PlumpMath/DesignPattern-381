package com.wuxy13.pattern.decorator.beverage.decorated;

public abstract class Beverage {
	protected String description;
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
}
