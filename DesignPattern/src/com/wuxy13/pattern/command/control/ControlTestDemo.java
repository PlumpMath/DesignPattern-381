package com.wuxy13.pattern.command.control;

import com.wuxy13.pattern.command.control.command.AudioOffCommand;
import com.wuxy13.pattern.command.control.command.AudioOnCommand;
import com.wuxy13.pattern.command.control.command.AutoOffCommand;
import com.wuxy13.pattern.command.control.command.AutoOnCommand;
import com.wuxy13.pattern.command.control.command.Command;
import com.wuxy13.pattern.command.control.command.DoorOffCommand;
import com.wuxy13.pattern.command.control.command.DoorOnCommand;
import com.wuxy13.pattern.command.control.command.FanOffCommand;
import com.wuxy13.pattern.command.control.command.FanOnCommand;
import com.wuxy13.pattern.command.control.command.LightOffCommand;
import com.wuxy13.pattern.command.control.command.LightOnCommand;
import com.wuxy13.pattern.command.control.command.NullCommand;
import com.wuxy13.pattern.command.control.command.UndoCommand;
import com.wuxy13.pattern.command.control.remote.RemoteControl;
import com.wuxy13.pattern.command.control.things.Audio;
import com.wuxy13.pattern.command.control.things.Door;
import com.wuxy13.pattern.command.control.things.Fan;
import com.wuxy13.pattern.command.control.things.Light;

public class ControlTestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Light light=new Light("Bedroom");
		Fan fan=new Fan("Livingroom");
		Door door=new Door("Gate");
		Audio audio=new Audio("Washroom");
		
		Command lightOnCommand=new LightOnCommand(light);
		Command fanOnCommand=new FanOnCommand(fan);
		Command doorOnCommand=new DoorOnCommand(door);
		Command audioOnCommand=new AudioOnCommand(audio);
		Command[] totalOnCommand={lightOnCommand,fanOnCommand,doorOnCommand,audioOnCommand};
		Command autoOnCommand=new AutoOnCommand(totalOnCommand);
		
		Command lightOffCommand=new LightOffCommand(light);
		Command fanOffCommand=new FanOffCommand(fan);
		Command doorOffCommand=new DoorOffCommand(door);
		Command audioOffCommand=new AudioOffCommand(audio);
		Command[] totalOffCommand={lightOffCommand,fanOffCommand,doorOffCommand,audioOffCommand};
		Command autoOffCommand=new AutoOffCommand(totalOffCommand);
		Command undoCommand=new UndoCommand();
		Command nullCommand=new NullCommand();
		
		RemoteControl rc=new RemoteControl();
		rc.setCommand(0, lightOnCommand, lightOffCommand);
		rc.setCommand(1, fanOnCommand, fanOffCommand);
		rc.setCommand(2, doorOnCommand, doorOffCommand);
		rc.setCommand(3, audioOnCommand, audioOffCommand);
		rc.setCommand(4, autoOnCommand, autoOffCommand);
		//rc.setCommand(5, undoCommand, nullCommand);
		
		System.out.println(rc.toString());
		rc.onButtonWasPushed(4);
		rc.offButtonWasPushed(4);
		rc.onButtonWasPushed(0);
		rc.offButtonWasPushed(0);
		rc.onButtonWasPushed(1);
		rc.onButtonWasPushed(1);
		rc.onButtonWasPushed(1);
		rc.offButtonWasPushed(1);
		rc.offButtonWasPushed(1);
		rc.offButtonWasPushed(1);
		rc.onButtonWasPushed(2);
		rc.undoButtonWasPushed(2);
		rc.offButtonWasPushed(2);
		rc.onButtonWasPushed(3);
		rc.offButtonWasPushed(3);
		rc.onButtonWasPushed(5);
		
	}

}
