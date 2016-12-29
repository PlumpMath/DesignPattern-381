package com.wuxy13.pattern.strategy.duck.model;

import com.wuxy13.pattern.strategy.duck.action.FlyNoWay;
import com.wuxy13.pattern.strategy.duck.action.Squeak;

public class ToyDuck extends Duck {

	public ToyDuck() {
		super("ToyDuck");
		// TODO Auto-generated constructor stub
		setFlyable(new FlyNoWay());
		setQuackable(new Squeak());
	}

}
