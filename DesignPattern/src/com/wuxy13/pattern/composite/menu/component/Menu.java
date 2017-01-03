package com.wuxy13.pattern.composite.menu.component;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
	public ArrayList<MenuComponent> menuComponents;
	public String description;
	public Menu(String description) {
		// TODO Auto-generated constructor stub
		menuComponents=new ArrayList<MenuComponent>();
		this.description=description;
	}
	public String getDescription() {
		return description;
	}
	
	@Override
	public void add(MenuComponent menuComponent) {
		// TODO Auto-generated method stub
		menuComponents.add(menuComponent);
	}
	
	@Override
	public MenuComponent getchild(int i) {
		// TODO Auto-generated method stub
		return menuComponents.get(i);
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(description);
		Iterator<MenuComponent> menuIterator=menuComponents.iterator();
		while(menuIterator.hasNext()){
			menuIterator.next().print();
		}
	}
	
	
}
