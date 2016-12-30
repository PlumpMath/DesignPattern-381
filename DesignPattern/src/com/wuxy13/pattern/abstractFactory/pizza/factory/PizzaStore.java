package com.wuxy13.pattern.abstractFactory.pizza.factory;

import com.wuxy13.pattern.abstractFactory.pizza.products.Pizza;



public abstract class PizzaStore {
	private Pizza pizza;
	private String name;
	
	public String getName(){
		return name;
	}
	
	public PizzaStore(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	
	public Pizza orderPizza(String type){
		pizza=createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	protected abstract Pizza createPizza(String type);
}
