package com.wuxy13.pattern.iterator.menu.menu;

import java.util.ArrayList;
import java.util.Iterator;

public class ShopAMenu implements Menu {
	private ArrayList menuItems;
	
	public ShopAMenu() {
		// TODO Auto-generated constructor stub
		menuItems=new ArrayList();
		addItem("ShopAKind1", 1.99);
		addItem("ShopAKind2", 2.99);
		addItem("ShopAKind3", 3.99);
		addItem("ShopAKind4", 4.99);
		addItem("ShopAKind5", 5.99);
	}
	
	protected void addItem(String name,double price){
		MenuItem menuItem=new MenuItem(name, price);
		menuItems.add(menuItem);
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return menuItems.iterator();
	}

}
