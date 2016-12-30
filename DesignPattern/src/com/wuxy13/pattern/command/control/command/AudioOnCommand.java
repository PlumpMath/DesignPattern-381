package com.wuxy13.pattern.command.control.command;

import com.wuxy13.pattern.command.control.things.Audio;

public class AudioOnCommand implements Command {
	private Audio audio;
	
	public AudioOnCommand(Audio audio) {
		this.audio=audio;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		audio.play();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		audio.off();
	}

}
