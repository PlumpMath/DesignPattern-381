this is a simple demo for observer pattern, using Java API in package java.utils.(pull based)

|---Class:Observable addObserver() deleteObserver() notifyObservers() setChanged() =>API	 									 
|<------ class:WeatherData  ArrayList observers; float temperature; float pressure;
|							getTemperature() getPressure() measurementChanged() setMeasurement()
|
|-- |Interface:Observer update() =>API
	| |---Interface:DisplayElement display()
 	| |<------ class:CurrentConditions MediumConditions 