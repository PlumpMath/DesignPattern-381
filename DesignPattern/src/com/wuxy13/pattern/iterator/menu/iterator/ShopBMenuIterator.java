package com.wuxy13.pattern.iterator.menu.iterator;

import java.util.Iterator;

import com.wuxy13.pattern.iterator.menu.menu.MenuItem;

public class ShopBMenuIterator implements Iterator {
	private MenuItem[] menuItems;
	private int length;
	private int index=0;
	
	public ShopBMenuIterator(MenuItem[] menuItems) {
		// TODO Auto-generated constructor stub
		this.menuItems=menuItems;
		this.length=menuItems.length;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(index<length){
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return menuItems[index++];
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
