package com.wuxy13.pattern.proxy.machine.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.wuxy13.pattern.proxy.machine.state.HasQuarterState;
import com.wuxy13.pattern.proxy.machine.state.NoQuarterState;
import com.wuxy13.pattern.proxy.machine.state.SoldOutState;
import com.wuxy13.pattern.proxy.machine.state.SoldState;
import com.wuxy13.pattern.proxy.machine.state.State;
import com.wuxy13.pattern.proxy.machine.state.WinnerState;



public class GumbalMachine extends UnicastRemoteObject implements GumbalMachineRemote{
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
	private State soldOutState;
	private State WinnerState;
	private State state;
	private int count;
	private String location;
	
	
	public GumbalMachine(int count,String location) throws RemoteException{
		// TODO Auto-generated constructor stub
		noQuarterState=new NoQuarterState(this);
		hasQuarterState=new HasQuarterState(this);
		soldState=new SoldState(this);
		soldOutState=new SoldOutState(this);
		WinnerState=new WinnerState(this);
		this.count=count;
		this.location=location;
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
	
	public String getState() {
		return state.getName();
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

	@Override
	public String getLocation() throws RemoteException {
		// TODO Auto-generated method stub
		return location;
	}
	
}
