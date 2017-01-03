package com.wuxy13.pattern.composite.menu.component;

public class MenuItem extends MenuComponent {
	private String name;
	private double price;
	private boolean isMeat;
	
	public MenuItem(String name,double price,boolean isMeat) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.price=price;
		this.isMeat=isMeat;
	}
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public boolean isMeat() {
		return isMeat;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(name+"-|-"+price+"-|-"+isMeat);
	}
	
	
}
