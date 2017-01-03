package com.wuxy13.pattern.iterator.menu.menu;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public class ShopCMenu implements Menu {
	private Hashtable menuItems;
	
	public ShopCMenu() {
		// TODO Auto-generated constructor stub
		menuItems=new Hashtable();
		addItem("ShopCKind1", 1.99);
		addItem("ShopCKind2", 2.99);
		addItem("ShopCKind3", 3.99);
		addItem("ShopCKind4", 4.99);
		addItem("ShopCKind5", 5.99);
	}
	
	protected void addItem(String name,double price){
		MenuItem menuItem=new MenuItem(name, price);
		menuItems.put(menuItem.getName(), menuItem);
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return menuItems.values().iterator();
	}

}
