package com.wuxy13.pattern.decorator.beverage.decorator;

import com.wuxy13.pattern.decorator.beverage.decorated.Beverage;

public class Mocha extends CondimentDecorator {
	
	public Mocha(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage=beverage;
		description=beverage.getDescription()+"<+>[Mocha]";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.2+beverage.cost();
	}

}
