this is a simple demo for factory pattern.

|---Abstract Class:PizzaStore Pizza pizza; String name; 
|				   Pizza orderPizza(String type); abstract Pizza creatPizza(String type);		 
|---|---Abstract Class:Pizza name dough sauce ; prepare;bake;cut;box;
|	|<------Class:PizzaACheese PizzaAClam PizzaAVeggle		
|	|<------Class:PizzaBCheese PizzaBClam PizzaBVeggle	 
|<------Class:PizzaStoreA
|<------Class:PizzaStoreB
					   