package com.wuxy13.pattern.abstractFactory.pizza.products;

public abstract class Pizza {
	protected String name;
	protected String dough;
	protected String sauce;
	
	public Pizza(String name,String dough,String sauce) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.dough=dough;
		this.sauce=sauce;
	}
	
	public abstract void prepare();
	
	public void bake(){
		System.out.println("Bake 20 minutes");
	}
	
	public void cut(){
		System.out.println("Cut 8 slices");
	}
	
	public void box(){
		System.out.println("Package into box");
		System.out.println("****************");
	}
	
	public String getDescription(){
		return "["+name+"]"+"::<"+dough+"><"+sauce+">.";
	}
}
