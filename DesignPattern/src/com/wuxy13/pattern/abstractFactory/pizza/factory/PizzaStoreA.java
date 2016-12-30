package com.wuxy13.pattern.abstractFactory.pizza.factory;

import com.wuxy13.pattern.abstractFactory.pizza.products.Pizza;
import com.wuxy13.pattern.abstractFactory.pizza.products.PizzaACheese;
import com.wuxy13.pattern.abstractFactory.pizza.products.PizzaAClam;
import com.wuxy13.pattern.abstractFactory.pizza.products.PizzaAVeggle;
import com.wuxy13.pattern.abstractFactory.pizza.products.PizzaNull;


public class PizzaStoreA extends PizzaStore {

	public PizzaStoreA() {
		super("PizzaStoreA");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to "+getName());
		
		if(type.equals("Cheese")){
			return new PizzaACheese();
		}else if (type.equals("Clam")) {
			return new PizzaAClam();
		}else if(type.equals("Veggle")){
			return new PizzaAVeggle();
		}
		
		return new PizzaNull();
	}

}
