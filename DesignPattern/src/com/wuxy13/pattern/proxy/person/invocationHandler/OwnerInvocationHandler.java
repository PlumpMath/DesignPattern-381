package com.wuxy13.pattern.proxy.person.invocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.wuxy13.pattern.proxy.person.bean.PersonBean;
import com.wuxy13.pattern.proxy.person.bean.PersonBeanImpl;

public class OwnerInvocationHandler implements InvocationHandler {
	private PersonBean personBean;
	
	public OwnerInvocationHandler(PersonBean personBean) {
		// TODO Auto-generated constructor stub
		this.personBean=personBean;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		try {
			if(method.getName().startsWith("get")){
				return method.invoke(personBean, args);
			}else if(method.getName().equals("setRating")){
				System.err.println("Owner cannot set rating!");
				return null;
			}else if(method.getName().startsWith("set")){
				return method.invoke(personBean, args);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
