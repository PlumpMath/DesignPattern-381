package com.wuxy13.pattern.decorator.beverage.decorated;

public class Espresso extends Beverage {
	
	public Espresso() {
		// TODO Auto-generated constructor stub
		description="<Espresso>";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.05;
	}

}
