package com.wuxy13.pattern.proxy.machine.state;

import java.io.Serializable;


public interface State extends Serializable{
	public void insertQuarter(); 
	public void ejectQuarter(); 
	public void turnCrank(); 
	public void dispense();
	public String getName();
}
