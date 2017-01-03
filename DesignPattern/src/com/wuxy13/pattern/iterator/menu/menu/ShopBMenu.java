package com.wuxy13.pattern.iterator.menu.menu;

import java.util.Iterator;

import com.wuxy13.pattern.iterator.menu.iterator.ShopBMenuIterator;

public class ShopBMenu implements Menu {
	private MenuItem[] menuItems;
	private int i=0;
	
	public ShopBMenu() {
		// TODO Auto-generated constructor stub
		menuItems=new MenuItem[5];
		addItem("ShopBKind1", 1.99);
		addItem("ShopBKind2", 2.99);
		addItem("ShopBKind3", 3.99);
		addItem("ShopBKind4", 4.99);
		addItem("ShopBKind5", 5.99);
	}
	
	protected void addItem(String name,double price){
		MenuItem menuItem=new MenuItem(name, price);
		menuItems[i++]=menuItem;
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ShopBMenuIterator(menuItems); 
	}

}
