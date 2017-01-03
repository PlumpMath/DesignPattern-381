package com.wuxy13.pattern.adapter.duck.adapter;

import com.wuxy13.pattern.adapter.duck.duck.Duck;
import com.wuxy13.pattern.adapter.duck.turkey.Turkey;

public class TurkeyToDuckAdapter implements Duck{
	private Turkey turkey;
	
	public TurkeyToDuckAdapter(Turkey turkey) {
		// TODO Auto-generated constructor stub
		this.turkey=turkey;
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("TurkeyToDuckAdapter");
		turkey.gobble();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("TurkeyToDuckAdapter");
		turkey.jump();
	}
}
