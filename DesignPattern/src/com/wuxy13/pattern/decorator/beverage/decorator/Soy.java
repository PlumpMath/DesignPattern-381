package com.wuxy13.pattern.decorator.beverage.decorator;

import com.wuxy13.pattern.decorator.beverage.decorated.Beverage;

public class Soy extends CondimentDecorator {
	
	public Soy(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage=beverage;
		description=beverage.getDescription()+"<+>[Soy]";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.15+beverage.cost();
	}

}
