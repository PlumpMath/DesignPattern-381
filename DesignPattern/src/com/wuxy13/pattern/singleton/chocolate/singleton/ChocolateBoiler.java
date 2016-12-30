package com.wuxy13.pattern.singleton.chocolate.singleton;

public class ChocolateBoiler {
	private static ChocolateBoiler cb;
	private boolean empty;
	private boolean boiled;
	
	private ChocolateBoiler() {
		// TODO Auto-generated constructor stub
		empty=true;
		boiled=false;
	}
	
	public static ChocolateBoiler getInstance(){
		if(cb==null){
			cb=new ChocolateBoiler();
		}
		return cb;
	}
	
	public boolean isEmpty() {
		return empty;
	}
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
	public boolean isBoiled() {
		return boiled;
	}
	public void setBoiled(boolean boiled) {
		this.boiled = boiled;
	}
	
	public void fill(){
		if(isEmpty()){
			System.out.println("Empty!Fill in!");
			setEmpty(false);
		}else{
			System.out.println("Full!Fill Forbidden!");
		}
	}
	
	public void boil(){
		if(!isEmpty()&&!isBoiled()){
			System.out.println("Boil!");
			setBoiled(true);
		}else if(!isEmpty()&&isBoiled()){
			System.out.println("Having boiled!NOT again!");
		}else if(isEmpty()){
			System.out.println("Empty!Fill in first!");
		}else{
			System.out.println("ERROR!");
		}
	}
	
	public void drain(){
		if(!isEmpty()&&isBoiled()){
			System.out.println("Drain!");
			setEmpty(true);
			setBoiled(false);
		}else if(!isEmpty()&&!isBoiled()){
			System.out.println("Not boiled!Boil first!");
		}else if(isEmpty()){
			System.out.println("Empty!Not again!");
		}else{
			System.out.println("ERROR!");
		}
	}
	
	
}
