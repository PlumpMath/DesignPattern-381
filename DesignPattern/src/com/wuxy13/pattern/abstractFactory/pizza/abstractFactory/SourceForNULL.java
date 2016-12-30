package com.wuxy13.pattern.abstractFactory.pizza.abstractFactory;

public class SourceForNULL implements SourceFactory {

	@Override
	public String createDough() {
		// TODO Auto-generated method stub
		return "SourceFactoryDoughNULL";
	}

	@Override
	public String createSauce() {
		// TODO Auto-generated method stub
		return "SourceFactorySauceNULL";
	}

}
