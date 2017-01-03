package com.wuxy13.pattern.adapter.duck;

import com.wuxy13.pattern.adapter.duck.adapter.TurkeyToDuckAdapter;
import com.wuxy13.pattern.adapter.duck.duck.Duck;
import com.wuxy13.pattern.adapter.duck.duck.RedHeadDuck;
import com.wuxy13.pattern.adapter.duck.turkey.BigTurkey;
import com.wuxy13.pattern.adapter.duck.turkey.Turkey;

public class DuckTestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck duck=new RedHeadDuck();
		Turkey turkey=new BigTurkey();
		Duck turkeyToDuck=new TurkeyToDuckAdapter(turkey);
		System.out.println("Duck");
		duck.quack();
		duck.fly();
		System.out.println("Turkey");
		turkey.gobble();
		turkey.jump();
		System.out.println("TurkeyToDuck");
		turkeyToDuck.quack();
		turkeyToDuck.fly();
	}

}
