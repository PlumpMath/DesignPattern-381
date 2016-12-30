package com.wuxy13.pattern.command.control.things;

public class Light {
	private String name;
	
	public Light() {
		// TODO Auto-generated constructor stub
		this.name="NoName";
	}
	
	public Light(String name){
		this.name=name;
	}
	
	public void on(){
		System.out.println(name+" light is on.");
	}
	
	public void off(){
		System.out.println(name+" light is off.");
	}
}
