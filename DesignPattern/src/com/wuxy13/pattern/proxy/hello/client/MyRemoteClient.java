package com.wuxy13.pattern.proxy.hello.client;

import java.rmi.Naming;

import com.wuxy13.pattern.proxy.hello.server.MyRemote;

public class MyRemoteClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRemoteClient client=new MyRemoteClient();
		client.sayToServer();
	}

	public void sayToServer(){
		try {
			System.out.println("sayToServer");
			MyRemote service=(MyRemote)Naming.lookup("rmi://127.0.0.1/serviceHello");
			System.out.println(service.sayHello());
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Client Error");
		}
	}
}
