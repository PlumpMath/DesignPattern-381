package com.wuxy13.pattern.factory.pizza.products;

public abstract class Pizza {
	private String name;
	private String dough;
	private String sauce;
	
	public Pizza(String name,String dough,String sauce) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.dough=dough;
		this.sauce=sauce;
	}
	
	public void prepare(){
		System.out.println("***************");
		System.out.println("Prepare "+name);
		System.out.println("Adding "+dough);
		System.out.println("Adding "+sauce);
	}
	
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
