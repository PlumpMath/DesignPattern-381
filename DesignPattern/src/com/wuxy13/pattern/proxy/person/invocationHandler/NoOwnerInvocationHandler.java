package com.wuxy13.pattern.proxy.person.invocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.wuxy13.pattern.proxy.person.bean.PersonBean;
import com.wuxy13.pattern.proxy.person.bean.PersonBeanImpl;

public class NoOwnerInvocationHandler implements InvocationHandler {
	private PersonBean personBean;
	
	public NoOwnerInvocationHandler(PersonBean personBean) {
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
				return method.invoke(personBean, args);
			}else if(method.getName().startsWith("set")){
				System.err.println("Visitor cannot set name and gender!");
				return null;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
