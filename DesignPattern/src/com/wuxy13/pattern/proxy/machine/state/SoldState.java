package com.wuxy13.pattern.proxy.machine.state;

import com.wuxy13.pattern.proxy.machine.server.GumbalMachine;



public class SoldState implements State{
	GumbalMachine gumbalMachine;

	public SoldState(GumbalMachine gumbalMachine) {
		// TODO Auto-generated constructor stub
		this.gumbalMachine=gumbalMachine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Sold!Can't insert!");
		
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Sold!Can't enject!");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("Sold!Can't turn crank!");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		if(gumbalMachine.getCount()>1){
			System.out.println("Dispense!");
			gumbalMachine.setCount(gumbalMachine.getCount()-1);
			gumbalMachine.setState(gumbalMachine.getNoQuarterState());
		}
		else if(gumbalMachine.getCount()==1){
			System.out.println("Dispense!");
			gumbalMachine.setCount(0);
			gumbalMachine.setState(gumbalMachine.getSoldOutState());
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "SoldState";
	}
	
	
}
