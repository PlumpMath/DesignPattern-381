package com.wuxy13.pattern.strategy.duck.model;

import com.wuxy13.pattern.strategy.duck.action.Flyable;
import com.wuxy13.pattern.strategy.duck.action.Quackable;

public abstract class Duck {
	private String duckName;
	private Flyable flyable;
	private Quackable quackable;
	
	public Duck(String duckName) {
		// TODO Auto-generated constructor stub
		this.duckName= duckName;
	}
	
	public void setFlyable(Flyable flyable) {
		this.flyable = flyable;
	}
	public void setQuackable(Quackable quackable) {
		this.quackable = quackable;
	}
	
	public void performFly(){
		flyable.fly();
	}
	
	public void performQuack(){
		quackable.quack();
	}
	
	public void swim(){
		System.out.println("Duck all can swim.");
	}
	
	public void display(){
		System.out.println("********************");
		System.out.println("This is a "+duckName);
		performFly();
		performQuack();
		swim();
		System.out.println("********************");
	}
}
