package com.wuxy13.pattern.decorator.beverage.decorated;

public class Decaf extends Beverage {
	
	public Decaf() {
		// TODO Auto-generated constructor stub
		description="<Decaf>";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}

}
