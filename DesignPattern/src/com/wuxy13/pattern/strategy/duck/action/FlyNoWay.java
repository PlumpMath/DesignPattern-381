package com.wuxy13.pattern.strategy.duck.action;

public class FlyNoWay implements Flyable {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("It can not fly.");
	}

}
