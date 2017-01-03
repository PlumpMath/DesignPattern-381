package com.wuxy13.pattern.composite.menu;

import com.wuxy13.pattern.composite.menu.component.Menu;
import com.wuxy13.pattern.composite.menu.component.MenuComponent;
import com.wuxy13.pattern.composite.menu.component.MenuItem;
import com.wuxy13.pattern.composite.menu.waitress.Waitress;


public class MenuTestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuComponent menuA=new Menu("menuA");
		MenuComponent menuB=new Menu("menuB");
		MenuComponent menuBC=new Menu("MenuBC");
		MenuComponent menuCD=new Menu("MenuCD");
		MenuComponent menuE=new Menu("MenuE");
		MenuComponent menuAll=new Menu("menuAll");
		
		menuAll.add(menuA);
		menuAll.add(menuB);
		menuAll.add(menuE);
		
		menuA.add(new MenuItem("menuAItem1", 0.99, true));
		menuA.add(new MenuItem("menuAItem2", 1.99, false));
		menuA.add(new MenuItem("menuAItem3", 2.99, true));
		
		menuB.add(new MenuItem("menuBItem1", 0.99, true));
		menuB.add(menuBC);
		menuB.add(new MenuItem("menuBItem3", 1.99, true));
		
		menuE.add(new MenuItem("menuEItem1", 0.99, false));
		menuE.add(new MenuItem("menuEItem2", 1.99, false));
		menuE.add(new MenuItem("menuEItem3", 2.99, true));
		
		menuBC.add(new MenuItem("menuBCItem1", 0.99, true));
		menuBC.add(new MenuItem("menuBCItem2", 1.99, false));
		menuBC.add(menuCD);
		
		menuCD.add(new MenuItem("menuCDItem1", 0.99, true));
		menuCD.add(new MenuItem("menuCDItem2", 1.99, false));
		menuCD.add(new MenuItem("menuCDItem3", 2.99, true));
		
		Waitress waitress=new Waitress(menuAll);
		waitress.printMenu();
	}

}
