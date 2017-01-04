package com.wuxy13.pattern.proxy.machine.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.wuxy13.pattern.proxy.machine.server.GumbalMachineRemote;

public class GumbalMonitorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			GumbalMachineRemote server=(GumbalMachineRemote)Naming.lookup("rmi://127.0.0.1/gumbalMachine");
			GumbalMonitor monitor=new GumbalMonitor(server);
			monitor.report();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Client Error");
		}
	}

}
