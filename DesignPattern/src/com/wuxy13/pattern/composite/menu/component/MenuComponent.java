package com.wuxy13.pattern.composite.menu.component;

import com.wuxy13.pattern.iterator.menu.menu.MenuItem;

public abstract class MenuComponent {
	public String getName(){System.out.println("No getName");return "No getName";}
	public String getDescription(){System.out.println("No getDescription");return "No getDescription";}
	public double getPrice(){System.out.println("No getPrice");return 0;}
	public boolean isMeat(){System.out.println("No isMeat");return false;}
	public void add(MenuComponent menuItem){System.out.println("No add");}
	public void remove(){System.out.println("No remove");}
	public MenuComponent getchild(int i){System.out.println("No getchild");return null;}
	public void print(){System.out.println("No print");}
}
