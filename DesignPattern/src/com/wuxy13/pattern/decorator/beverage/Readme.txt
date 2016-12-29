this is a simple demo for decorator pattern.

|---Abstract Class:Beverage String description; getDescription(); cost();		 
|<------ class:HouseBlend DarkRoast Espresso Decaf cost();
|				 .89		.99		  1.05	 1.99
|<------|Abstract Class:CondimentDecorator Beverage beverage;
		|<------Class:Milk Mocha Soy Whip  cost();
					   .1    .2  .15  .3