package com.wuxy13.pattern.abstractFactory.pizza.abstractFactory;

public class SourceForA implements SourceFactory {

	@Override
	public String createDough() {
		// TODO Auto-generated method stub
		return "SourceFactoryDoughA";
	}

	@Override
	public String createSauce() {
		// TODO Auto-generated method stub
		return "SourceFactorySauceA";
	}

}
