package com.wuxy13.pattern.templateMethod.tea;

import com.wuxy13.pattern.decorator.beverage.decorated.Beverage;
import com.wuxy13.pattern.templateMethod.tea.beverage.Coffee;
import com.wuxy13.pattern.templateMethod.tea.beverage.Tea;

public class TeaTestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tea tea=new Tea();
		Coffee coffee=new Coffee();
		System.out.println("Tea!");
		tea.prepare();
		System.out.println("\nCoffee!");
		coffee.prepare();
	}

}
