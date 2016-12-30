package com.wuxy13.pattern.singleton.chocolate;

import com.wuxy13.pattern.singleton.chocolate.singleton.ChocolateBoiler;

public class ChocolateBoilerTestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChocolateBoiler cb=ChocolateBoiler.getInstance();
		ChocolateBoiler cbElse=ChocolateBoiler.getInstance();
		cb.fill();
		cbElse.fill();
		cb.boil();
		cb.drain();
		cbElse.boil();
		cbElse.drain();
		cbElse.fill();
	}

}
