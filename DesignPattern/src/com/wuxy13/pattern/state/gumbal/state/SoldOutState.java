package com.wuxy13.pattern.state.gumbal.state;

import com.wuxy13.pattern.state.gumbal.context.GumbalMachine;

public class SoldOutState implements State{
	GumbalMachine gumbalMachine;
	
	public SoldOutState(GumbalMachine gumbalMachine) {
		// TODO Auto-generated constructor stub
		this.gumbalMachine=gumbalMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Sold out!Can't insert!");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Sold out!Can't eject!");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("Sold out!Can't turn crank!");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("Sold out!Can't dispense");
	}
	
	
}
