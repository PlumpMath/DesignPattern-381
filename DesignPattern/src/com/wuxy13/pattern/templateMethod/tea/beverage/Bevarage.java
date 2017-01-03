package com.wuxy13.pattern.templateMethod.tea.beverage;

public abstract class Bevarage {
	final public void prepare(){
		boil();
		bew();
		poor();
		add();
		order();
	} 
	
	final public void boil(){
		System.out.println("Final Boil!");
	};
	final public void poor(){
		System.out.println("Final Poor!");
	};
	abstract public void bew();
	abstract public void add();
	public void order(){
		System.out.println("Hook Order!");
	}
	
}
