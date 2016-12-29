package com.wuxy13.pattern.observer.weather.subject;

import com.wuxy13.pattern.observer.weather.observer.Observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
