package com.wuxy13.pattern.command.control.command;

public class NullCommand implements Command {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("NullCommand.");
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("NullCommand.");
	}

}
