package com.wuxy13.pattern.proxy.person;

import java.io.ObjectInputStream.GetField;
import java.lang.reflect.Proxy;

import com.wuxy13.pattern.proxy.person.bean.PersonBean;
import com.wuxy13.pattern.proxy.person.bean.PersonBeanImpl;
import com.wuxy13.pattern.proxy.person.invocationHandler.NoOwnerInvocationHandler;
import com.wuxy13.pattern.proxy.person.invocationHandler.OwnerInvocationHandler;

public class PersonTestDemo {

	/**
	 * @param args
	 */
	public static PersonBean getOwnerProxy(PersonBean person){
		return (PersonBean)Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
	}
	
	public static PersonBean getVisitorProxy(PersonBean person){
		return (PersonBean)Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new NoOwnerInvocationHandler(person));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonBean personBeanA=new PersonBeanImpl("pA", "male",20,4);
		PersonBean ownerProxy=getOwnerProxy(personBeanA);
		PersonBean personBeanB=new PersonBeanImpl("pB", "female",30,10);
		PersonBean visitorProxy=getVisitorProxy(personBeanB);
		
		System.out.println(ownerProxy.getName()+"|"+ownerProxy.getGender()+"|"+ownerProxy.getRating());
		ownerProxy.setRating(10);
		ownerProxy.setName("PPA");
		ownerProxy.setGender("m_male");
		System.out.println(ownerProxy.getName()+"|"+ownerProxy.getGender()+"|"+ownerProxy.getRating());
		
		
		System.out.println(visitorProxy.getName()+"|"+visitorProxy.getGender()+"|"+visitorProxy.getRating());
		visitorProxy.setRating(10);
		visitorProxy.setName("PPA");
		visitorProxy.setGender("m_male");
		System.out.println(visitorProxy.getName()+"|"+visitorProxy.getGender()+"|"+visitorProxy.getRating());
		
		
	}

}
