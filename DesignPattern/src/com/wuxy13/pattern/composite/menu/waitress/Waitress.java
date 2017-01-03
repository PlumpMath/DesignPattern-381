package com.wuxy13.pattern.composite.menu.waitress;

import com.wuxy13.pattern.composite.menu.component.MenuComponent;

public class Waitress {
	MenuComponent allMenus;
	public Waitress(MenuComponent allMenus) {
		// TODO Auto-generated constructor stub
		this.allMenus=allMenus;
	}
	public void printMenu(){
		allMenus.print();
	}
}
