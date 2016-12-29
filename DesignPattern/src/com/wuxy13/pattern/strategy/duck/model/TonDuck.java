package com.wuxy13.pattern.strategy.duck.model;

import com.wuxy13.pattern.strategy.duck.action.FlyNoWay;
import com.wuxy13.pattern.strategy.duck.action.MuteQuack;
import com.wuxy13.pattern.strategy.duck.action.Squeak;

public class TonDuck extends Duck {

	public TonDuck() {
		super("TonDuck");
		// TODO Auto-generated constructor stub
		setFlyable(new FlyNoWay());
		setQuackable(new MuteQuack());
	}

}
