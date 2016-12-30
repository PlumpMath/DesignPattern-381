package com.wuxy13.pattern.factory.pizza.factory;

import javax.print.attribute.standard.MediaSize.NA;

import com.wuxy13.pattern.factory.pizza.products.Pizza;
import com.wuxy13.pattern.factory.pizza.products.PizzaACheese;
import com.wuxy13.pattern.factory.pizza.products.PizzaAClam;
import com.wuxy13.pattern.factory.pizza.products.PizzaAVeggle;
import com.wuxy13.pattern.factory.pizza.products.PizzaNull;

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
