package com.wuxy13.pattern.abstractFactory.pizza.abstractFactory;

public class SourceForB implements SourceFactory {

	@Override
	public String createDough() {
		// TODO Auto-generated method stub
		return "SourceFactoryDoughB";
	}

	@Override
	public String createSauce() {
		// TODO Auto-generated method stub
		return "SourceFactorySauceB";
	}

}
