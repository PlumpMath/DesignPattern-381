package com.wuxy13.pattern.proxy.machine.state;

import java.util.Random;

import com.wuxy13.pattern.proxy.machine.server.GumbalMachine;



public class HasQuarterState implements State{
	GumbalMachine gumbalMachine;
	
	public HasQuarterState(GumbalMachine gumbalMachine) {
		// TODO Auto-generated constructor stub
		this.gumbalMachine=gumbalMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Has a quarter!Can't insert!");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Eject a quarter!");
		gumbalMachine.setState(gumbalMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("Turn Crank!");
		Random random=new Random(System.currentTimeMillis());
		int randomInt=random.nextInt(10);
		if(randomInt==0&&gumbalMachine.getCount()>1){
			System.out.println("Winner!Give you 2!");
			gumbalMachine.setState(gumbalMachine.getWinnerState());
		}else{
			System.out.println("Common!Give you 1!");
			gumbalMachine.setState(gumbalMachine.getSoldState());
		}
		
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("Has quarter!Can't dispense!");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "HasQuarterState";
	}
	
	
}
