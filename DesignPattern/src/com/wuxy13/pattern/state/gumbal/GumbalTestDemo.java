package com.wuxy13.pattern.state.gumbal;

import com.wuxy13.pattern.state.gumbal.context.GumbalMachine;

public class GumbalTestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GumbalMachine gumbalMachine=new GumbalMachine(4);
		
		gumbalMachine.insertQuarter();
		gumbalMachine.turnCrank();
		gumbalMachine.depense();
		
		gumbalMachine.insertQuarter();
		gumbalMachine.insertQuarter();
		gumbalMachine.depense();
		gumbalMachine.turnCrank();
		gumbalMachine.depense();
		
		gumbalMachine.insertQuarter();
		gumbalMachine.ejectQuarter();
		gumbalMachine.ejectQuarter();
		gumbalMachine.insertQuarter();
		gumbalMachine.turnCrank();
		gumbalMachine.depense();
		
		gumbalMachine.insertQuarter();
		gumbalMachine.turnCrank();
		gumbalMachine.depense();
		
	}

}
