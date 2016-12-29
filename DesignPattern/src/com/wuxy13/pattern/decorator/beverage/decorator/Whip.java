package com.wuxy13.pattern.decorator.beverage.decorator;

import com.wuxy13.pattern.decorator.beverage.decorated.Beverage;

public class Whip extends CondimentDecorator {
	
	public Whip(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage=beverage;
		description=beverage.getDescription()+"<+>[Whip]";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.3+beverage.cost();
	}

}
