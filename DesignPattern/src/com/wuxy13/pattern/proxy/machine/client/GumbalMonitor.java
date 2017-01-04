package com.wuxy13.pattern.proxy.machine.client;

import java.rmi.RemoteException;

import com.wuxy13.pattern.proxy.machine.server.GumbalMachine;
import com.wuxy13.pattern.proxy.machine.server.GumbalMachineRemote;

public class GumbalMonitor {
	GumbalMachineRemote gumbalMachine;
	
	public GumbalMonitor(GumbalMachineRemote gumbalMachine) {
		// TODO Auto-generated constructor stub
		this.gumbalMachine=gumbalMachine;
	}
	
	public void report(){
		System.out.println("Monitor!");
		try {
			System.out.println(gumbalMachine.getLocation());
			System.out.println(gumbalMachine.getCount());
			System.out.println(gumbalMachine.getState());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			System.err.println("Client Error");
		}
		
	}
}
