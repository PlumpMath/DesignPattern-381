package com.wuxy13.pattern.abstractFactory.pizza.factory;

import com.wuxy13.pattern.abstractFactory.pizza.products.Pizza;
import com.wuxy13.pattern.abstractFactory.pizza.products.PizzaBCheese;
import com.wuxy13.pattern.abstractFactory.pizza.products.PizzaBClam;
import com.wuxy13.pattern.abstractFactory.pizza.products.PizzaBVeggle;
import com.wuxy13.pattern.abstractFactory.pizza.products.PizzaNull;


public class PizzaStoreB extends PizzaStore {

	public PizzaStoreB() {
		super("PizzaStoreB");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to "+getName());
		
		if(type.equals("Cheese")){
			return new PizzaBCheese();
		}else if (type.equals("Clam")) {
			return new PizzaBClam();
		}else if(type.equals("Veggle")){
			return new PizzaBVeggle();
		}
		
		return new PizzaNull();
	}

}
