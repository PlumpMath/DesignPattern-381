package com.wuxy13.pattern.decorator.beverage.decorator;

import com.wuxy13.pattern.decorator.beverage.decorated.Beverage;

public abstract class CondimentDecorator extends Beverage {
	protected Beverage beverage;
}
