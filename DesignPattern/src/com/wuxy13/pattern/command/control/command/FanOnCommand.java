package com.wuxy13.pattern.command.control.command;

import com.wuxy13.pattern.command.control.things.Fan;

public class FanOnCommand implements Command {
	private Fan fan;
	
	public FanOnCommand(Fan fan) {
		// TODO Auto-generated constructor stub
		this.fan=fan;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fan.enhance();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		fan.weaken();
	}

}
