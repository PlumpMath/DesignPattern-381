package com.wuxy13.pattern.command.control.command;

import com.wuxy13.pattern.command.control.things.Audio;

public class AudioOffCommand implements Command {
	private Audio audio;
	
	public AudioOffCommand(Audio audio) {
		// TODO Auto-generated constructor stub
		this.audio=audio;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		audio.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		audio.play();
	}

}
