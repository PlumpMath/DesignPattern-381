this is a simple demo for observer pattern.

|---Interface:Subject registerObserver() removeObserver() notifyObservers()										 
|<------ class:WeatherData  ArrayList observers; float temperature; float pressure;
|							getTemperature() getPressure() measurementChanged() setMeasurement()
|
|-- |Interface:Observer update() 
	| |---Interface:DisplayElement display()
 	| |<------ class:CurrentConditions MediumConditions 