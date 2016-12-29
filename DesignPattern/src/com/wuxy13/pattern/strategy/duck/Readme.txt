this is a simple demo for strategy pattern.

----abstract class: Duck Flyable flyable						
|	|					 Quackable quackable
|	|					 swim() display() performQuack() performFly()
|	|<------ class:BlueheadDuck TonDuck  ToyDuck
|--	Interface:Flyable fly() <------ class:FlyWithWings FlyWithPower FlyNoWay
|--	Interface:Quackable quack() <------ class:Quack Squeak MuteQuack


