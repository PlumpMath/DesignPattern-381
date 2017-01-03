package com.wuxy13.pattern.state.gumbal.state;

import com.wuxy13.pattern.state.gumbal.context.GumbalMachine;

public class WinnerState implements State{
	GumbalMachine gumbalMachine;
	
	public WinnerState(GumbalMachine gumbalMachine) {
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
		System.out.println("Sold!Can't eject!");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("Sold!Can't turn crank!");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		if(gumbalMachine.getCount()>2){
			System.out.println("Dispense!");
			gumbalMachine.setCount(gumbalMachine.getCount()-2);
			gumbalMachine.setState(gumbalMachine.getNoQuarterState());
		}
		else if(gumbalMachine.getCount()==2){
			System.out.println("Dispense!");
			gumbalMachine.setCount(0);
			gumbalMachine.setState(gumbalMachine.getSoldOutState());
		}
	}
	
	
}
