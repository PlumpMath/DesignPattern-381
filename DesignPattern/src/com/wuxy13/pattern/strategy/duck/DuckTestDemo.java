package com.wuxy13.pattern.strategy.duck;

import com.wuxy13.pattern.strategy.duck.action.FlyWithPower;
import com.wuxy13.pattern.strategy.duck.model.Duck;
import com.wuxy13.pattern.strategy.duck.model.RedHeadDuck;
import com.wuxy13.pattern.strategy.duck.model.TonDuck;
import com.wuxy13.pattern.strategy.duck.model.ToyDuck;

public class DuckTestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck redHeadDuck=new RedHeadDuck();
		Duck tonDuck=new TonDuck();
		Duck toyDuck=new ToyDuck();
		redHeadDuck.display();
		tonDuck.display();
		toyDuck.display();
		toyDuck.setFlyable(new FlyWithPower());
		toyDuck.display();
	}

}
