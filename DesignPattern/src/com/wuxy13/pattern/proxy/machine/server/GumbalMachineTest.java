package com.wuxy13.pattern.proxy.machine.server;

import java.rmi.Naming;

public class GumbalMachineTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			GumbalMachineRemote server=new GumbalMachine(10, "USTC");
			Naming.rebind("gumbalMachine", server);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Server Error");
		}
	}

}
