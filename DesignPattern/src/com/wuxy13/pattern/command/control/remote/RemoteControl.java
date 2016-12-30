package com.wuxy13.pattern.command.control.remote;

import com.wuxy13.pattern.command.control.command.Command;
import com.wuxy13.pattern.command.control.command.NullCommand;

public class RemoteControl {
	private Command[] onCommands;
	private Command[] offCommands;
	private Command currentCommand;
	
	public RemoteControl() {
		// TODO Auto-generated constructor stub
		onCommands=new Command[6];
		offCommands=new Command[6];
		Command nullCommand=new NullCommand();
		for (int i=0;i<onCommands.length;i++) {
			onCommands[i]=nullCommand;
		}
		
		for (int i=0;i<offCommands.length;i++) {
			offCommands[i]=nullCommand;
		}		
	}
	
	public void setCommand(int index,Command onCommand,Command offCommand){
		onCommands[index]=onCommand;
		offCommands[index]=offCommand;
	}
	
	public void removeCommand(int index,Command onCommand,Command offCommand){
		Command nullCommand=new NullCommand();
		onCommands[index]=nullCommand;
		offCommands[index]=nullCommand;
	}
	
	public void onButtonWasPushed(int index){
		onCommands[index].execute();
		currentCommand=onCommands[index];
	}
	
	public void offButtonWasPushed(int index){
		offCommands[index].execute();
		currentCommand=offCommands[index];
	}
	
	public void undoButtonWasPushed(int index){
		currentCommand.undo();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer result=new StringBuffer();
		result.append("\n------------------------------Remote Control------------------------------\n");
		for (int i=0;i<onCommands.length;i++) {
			result.append("<slot"+i+">: "+onCommands[i].getClass().getName()+" | "+offCommands[i].getClass().getName()+"\n");
		}
		result.append("\n--------------------------------------------------------------------------\n");
		return result.toString();
	}
}
