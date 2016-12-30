this is a simple demo for command pattern.

|---Class:RemoteControl	onCommands; offCommands; 
|						setCommand(); onButtonWasPushed(); offButtonWasPushed();				
|
|
|---|---Interface:Command execute(); undo();
|	|<------|-Class:NullCommand NullCommand
|	|<------|-Class:LightOnCommand LightOffCommand
|	|<------|-Class:FanOnCommand FanOffCommand 
|	|<------|-Class:DoorOnCommand DoorOffCommand
	|<------|-Class:AudioOnCommand AudioOffCommand
	|<------|-Class:AutoOnCommand AutoOffCommand
			|
			|---Class:Light name; on(); off();
			|---Class:Fan name; enhance(); weaken();
			|---Class:Door name; open(); close();
			|---Class:Audio name; play(); off();
			
there is a problem unsolved:how to set a button has the function undo.
i think observer pattern can do it.