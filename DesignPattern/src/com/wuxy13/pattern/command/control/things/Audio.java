package com.wuxy13.pattern.command.control.things;

public class Audio {
	private String name;
	
	public Audio() {
		// TODO Auto-generated constructor stub
		this.name="NoName";
	}
	
	public Audio(String name){
		this.name=name;
	}
	
	public void play(){
		System.out.println(name+" audio is on.");
	}
	
	public void off(){
		System.out.println(name+" audio is off.");
	}
}
