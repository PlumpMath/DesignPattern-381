package com.wuxy13.pattern.proxy.machine.state;

import com.wuxy13.pattern.proxy.machine.server.GumbalMachine;



public class NoQuarterState implements State{
	GumbalMachine gumbalMachine;
	
	public NoQuarterState(GumbalMachine gumbalMachine) {
		// TODO Auto-generated constructor stub
		this.gumbalMachine=gumbalMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Insert a quarter!");
		gumbalMachine.setState(gumbalMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("No quarter!Can't eject!");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("No quater!Can't turn crack!");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("No quarter!Can't dispense!");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "NoQuarterState";
	}
	
	
}
