package com.wuxy13.pattern.strategy.duck.action;

public class MuteQuack implements Quackable {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("It can not quack.");
	}

}
