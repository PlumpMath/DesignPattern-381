package com.wuxy13.pattern.templateMethod.tea.beverage;

public class Coffee extends Bevarage {

	@Override
	public void bew() {
		// TODO Auto-generated method stub
		System.out.println("Coffee Bew!");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Coffee Add");
	}
	
	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("Hook Change,Coffee Order!");
	}

}
