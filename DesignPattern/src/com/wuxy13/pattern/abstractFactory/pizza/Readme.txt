this is a simple demo for abstract factory pattern.

|---Abstract Class:PizzaStore Pizza pizza; String name; 
|				   Pizza orderPizza(String type); abstract Pizza creatPizza(String type);		 
|---|---Abstract Class:Pizza name dough sauce ; abstract prepare;bake;cut;box;
|	|---Interface:SourceFactory createDough(); createSauce();
|	|<------Class:PizzaACheese PizzaAClam PizzaAVeggle		
|	|<------Class:PizzaBCheese PizzaBClam PizzaBVeggle	 
|<------Class:PizzaStoreA
|<------Class:PizzaStoreB