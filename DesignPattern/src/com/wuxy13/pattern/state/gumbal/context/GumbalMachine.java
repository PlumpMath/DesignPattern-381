package com.wuxy13.pattern.state.gumbal.context;

import com.wuxy13.pattern.state.gumbal.state.HasQuarterState;
import com.wuxy13.pattern.state.gumbal.state.NoQuarterState;
import com.wuxy13.pattern.state.gumbal.state.SoldOutState;
import com.wuxy13.pattern.state.gumbal.state.SoldState;
import com.wuxy13.pattern.state.gumbal.state.State;
import com.wuxy13.pattern.state.gumbal.state.WinnerState;

public class GumbalMachine {
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
	private State soldOutState;
	private State WinnerState;
	private State state;
	private int count;
	
	public GumbalMachine(int count) {
		// TODO Auto-generated constructor stub
		noQuarterState=new NoQuarterState(this);
		hasQuarterState=new HasQuarterState(this);
		soldState=new SoldState(this);
		soldOutState=new SoldOutState(this);
		WinnerState=new WinnerState(this);
		this.count=count;
		if(count>0){
			state=noQuarterState;
		}else{
			state=soldOutState;
		}
	}
	
	public void addCount(int count){
		count+=count;
		if(count>0){
			state=noQuarterState;
		}else{
			state=soldOutState;
		}
	}
	
	public void insertQuarter(){
		state.insertQuarter();
	}

	public void ejectQuarter(){
		state.ejectQuarter();
	}
	
	public void turnCrank(){
		state.turnCrank();
	}
	
	public void depense(){
		state.dispense();
	}
	
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public State getNoQuarterState() {
		return noQuarterState;
	}
	public State getHasQuarterState() {
		return hasQuarterState;
	}
	public State getSoldState() {
		return soldState;
	}
	public State getSoldOutState() {
		return soldOutState;
	}
	public State getWinnerState() {
		return WinnerState;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
