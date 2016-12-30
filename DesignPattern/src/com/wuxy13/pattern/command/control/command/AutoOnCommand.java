package com.wuxy13.pattern.command.control.command;

public class AutoOnCommand implements Command {
	private Command[] command;
	
	public AutoOnCommand(Command[] command) {
		// TODO Auto-generated constructor stub
		this.command=command;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		for (Command c : command) {
			c.execute();
		}
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		for (Command c : command) {
			c.undo();
		}
	}

}
