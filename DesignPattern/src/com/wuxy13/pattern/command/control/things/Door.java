package com.wuxy13.pattern.command.control.things;

public class Door {
	private String name;
	
	public Door() {
		// TODO Auto-generated constructor stub
		this.name="NoName";
	}
	
	public Door(String name){
		this.name=name;
	}
	
	public void open(){
		System.out.println(name+" door is open.");
	}
	
	public void close(){
		System.out.println(name+" door is close.");
	}
}
