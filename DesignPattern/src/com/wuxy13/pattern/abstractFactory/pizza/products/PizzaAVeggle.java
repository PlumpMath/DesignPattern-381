package com.wuxy13.pattern.abstractFactory.pizza.products;

import com.wuxy13.pattern.abstractFactory.pizza.abstractFactory.SourceFactory;
import com.wuxy13.pattern.abstractFactory.pizza.abstractFactory.SourceForA;

public class PizzaAVeggle extends Pizza {
	protected SourceFactory sf;
	
	public PizzaAVeggle() {
		super("PizzaAVeggle", "Veggle", "Veggle");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		sf=new SourceForA();
		dough+=sf.createDough();
		sauce+=sf.createSauce();
		System.out.println("***************");
		System.out.println("Prepare "+name);
		System.out.println("Adding "+dough);
		System.out.println("Adding "+sauce);
	}

}
