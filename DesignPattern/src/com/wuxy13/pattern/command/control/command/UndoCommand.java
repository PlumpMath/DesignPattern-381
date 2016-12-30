package com.wuxy13.pattern.command.control.command;

public class UndoCommand implements Command {
	private Command command;
	
	public void setCurrentCommand(Command command){
		this.command=command;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		command.undo();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("this is reset button, cannot undo.");
	}

}
