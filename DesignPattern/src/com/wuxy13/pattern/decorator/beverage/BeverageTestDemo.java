package com.wuxy13.pattern.decorator.beverage;

import javax.xml.ws.Holder;

import com.wuxy13.pattern.decorator.beverage.decorated.Beverage;
import com.wuxy13.pattern.decorator.beverage.decorated.DarkRoast;
import com.wuxy13.pattern.decorator.beverage.decorated.Decaf;
import com.wuxy13.pattern.decorator.beverage.decorated.Espresso;
import com.wuxy13.pattern.decorator.beverage.decorated.HouseBlend;
import com.wuxy13.pattern.decorator.beverage.decorator.CondimentDecorator;
import com.wuxy13.pattern.decorator.beverage.decorator.Milk;
import com.wuxy13.pattern.decorator.beverage.decorator.Mocha;
import com.wuxy13.pattern.decorator.beverage.decorator.Soy;
import com.wuxy13.pattern.decorator.beverage.decorator.Whip;

public class BeverageTestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**********************");
		System.out.println("MilkMochaSoy DarkRoast");
		Beverage b1=new DarkRoast();
		Beverage b11=new Milk(b1);
		Beverage b12=new Mocha(b11);
		Beverage b13=new Soy(b12);
		System.out.println(b13.getDescription());
		System.out.println(b13.cost());
		System.out.println("**********************");
		
		System.out.println("**********************");
		System.out.println("WhipMochaSoy Decaf");
		Beverage b2=new Decaf();
		Beverage b21=new Whip(b2);
		Beverage b22=new Mocha(b21);
		Beverage b23=new Soy(b22);
		System.out.println(b23.getDescription());
		System.out.println(b23.cost());
		System.out.println("**********************");
		
		System.out.println("**********************");
		System.out.println("SoyMochaSoy Espresso");
		Beverage b3=new Espresso();
		Beverage b31=new Soy(b3);
		Beverage b32=new Mocha(b31);
		Beverage b33=new Soy(b32);
		System.out.println(b33.getDescription());
		System.out.println(b33.cost());
		System.out.println("**********************");
		
		System.out.println("**********************");
		System.out.println("WhipMilkMochaMochaSoy HouseBlend");
		Beverage b4=new HouseBlend();
		Beverage b41=new Whip(b4);
		Beverage b42=new Milk(b41);
		Beverage b43=new Mocha(b42);
		Beverage b44=new Mocha(b43);
		Beverage b45=new Soy(b44);
		System.out.println(b45.getDescription());
		System.out.println(b45.cost());
		System.out.println("**********************");
		
	}

}
