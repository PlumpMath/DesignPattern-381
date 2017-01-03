package com.wuxy13.pattern.iterator.menu.waitress;

import java.util.Iterator;

import com.wuxy13.pattern.iterator.menu.menu.Menu;
import com.wuxy13.pattern.iterator.menu.menu.MenuItem;
import com.wuxy13.pattern.iterator.menu.menu.ShopAMenu;
import com.wuxy13.pattern.iterator.menu.menu.ShopBMenu;
import com.wuxy13.pattern.iterator.menu.menu.ShopCMenu;

public class Waitress {
	private Menu shopAMenu;
	private Menu shopBMenu;
	private Menu shopCMenu;
	
	public Waitress() {
		// TODO Auto-generated constructor stub
		shopAMenu=new ShopAMenu();
		shopBMenu=new ShopBMenu();
		shopCMenu=new ShopCMenu();
	}
	
	public void printMenu(){
		Iterator aMenu=shopAMenu.createIterator();
		Iterator bMenu=shopBMenu.createIterator();
		Iterator cMenu=shopCMenu.createIterator();
		System.out.println("Shop A Menu");
		printMenu(aMenu);
		System.out.println("Shop B Menu");
		printMenu(bMenu);
		System.out.println("Shop C Menu");
		printMenu(cMenu);
	}
	
	public void printMenu(Iterator iterator){
		MenuItem menuItem;
		while(iterator.hasNext()){
			menuItem=(MenuItem)iterator.next();
			System.out.println(menuItem.getName()+"---|---"+menuItem.getPrice());
		}
	}
}
