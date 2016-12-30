package com.wuxy13.pattern.command.control.things;

public class Fan {
	private String name;
	enum Level{off,low,medium,high} 
	Level level;
	
	public Fan() {
		// TODO Auto-generated constructor stub
		this.name="NoName";
		level=Level.off;
	}
	
	public Fan(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
		level=Level.off;
	}
	
	public void enhance(){
		switch (level) {
		case off:
			System.out.println(name+" fan is low.");
			level=Level.low;
			break;
		case low:
			System.out.println(name+" fan is medium.");
			level=Level.medium;
			break;
		case medium:
		case high:
			System.out.println(name+" fan is high.");
			level=Level.high;
			break;
		default:
			break;
		}
	}
	
	public void weaken(){
		switch (level) {
		case off:
		case low:
			System.out.println(name+" fan is off.");
			level=Level.off;
			break;
		case medium:
			System.out.println(name+" fan is low.");
			level=Level.low;
			break;
		case high:
			System.out.println(name+" fan is medium.");
			level=Level.medium;
			break;
		default:
			break;
		}
	}
}
