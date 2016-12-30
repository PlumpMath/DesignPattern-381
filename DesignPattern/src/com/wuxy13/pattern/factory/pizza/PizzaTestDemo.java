package com.wuxy13.pattern.factory.pizza;

import com.wuxy13.pattern.factory.pizza.factory.PizzaStore;
import com.wuxy13.pattern.factory.pizza.factory.PizzaStoreA;
import com.wuxy13.pattern.factory.pizza.factory.PizzaStoreB;

public class PizzaTestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStore psA=new PizzaStoreA();
		PizzaStore psB=new PizzaStoreB();
		System.out.println(psA.orderPizza("Cheese").getDescription());
		System.out.println(psA.orderPizza("Clam").getDescription());
		System.out.println(psB.orderPizza("NULL").getDescription());
		System.out.println(psB.orderPizza("Veggle").getDescription());
		
	}

}
