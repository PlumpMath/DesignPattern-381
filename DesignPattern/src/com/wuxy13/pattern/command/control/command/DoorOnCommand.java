package com.wuxy13.pattern.command.control.command;

import com.wuxy13.pattern.command.control.things.Door;

public class DoorOnCommand implements Command {
	private Door door;
	
	public DoorOnCommand(Door door) {
		// TODO Auto-generated constructor stub
		this.door=door;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		door.open();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		door.close();
	}

}
