package com.wuxy13.pattern.proxy.machine.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.wuxy13.pattern.proxy.machine.state.State;

public interface GumbalMachineRemote extends Remote {
	public int getCount() throws RemoteException;
	public String getLocation() throws RemoteException;
	public String getState() throws RemoteException;
}
