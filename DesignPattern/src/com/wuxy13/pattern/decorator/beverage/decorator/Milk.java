package com.wuxy13.pattern.decorator.beverage.decorator;

import com.wuxy13.pattern.decorator.beverage.decorated.Beverage;

public class Milk extends CondimentDecorator {
	
	public Milk(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage=beverage;
		description=beverage.getDescription()+"<+>[Milk]";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.1+beverage.cost();
	}

}
