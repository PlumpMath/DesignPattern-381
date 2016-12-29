package com.wuxy13.pattern.strategy.duck.model;

import com.wuxy13.pattern.strategy.duck.action.FlyWithWings;
import com.wuxy13.pattern.strategy.duck.action.Quack;

public class RedHeadDuck extends Duck {
	public RedHeadDuck() {
		// TODO Auto-generated constructor stub
		super("RedHeadDuck");
		setFlyable(new FlyWithWings());
		setQuackable(new Quack());
	}
}
