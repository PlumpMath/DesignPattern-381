package com.wuxy13.pattern.state.gumbal.state;

public interface State {
	public void insertQuarter(); 
	public void ejectQuarter(); 
	public void turnCrank(); 
	public void dispense();
}
