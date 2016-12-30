package com.wuxy13.pattern.command.control.command;

import com.wuxy13.pattern.command.control.things.Light;

public class LightOffCommand implements Command {
	private Light light;
	
	public LightOffCommand(Light light) {
		// TODO Auto-generated constructor stub
		this.light=light;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.on();
	}

}
