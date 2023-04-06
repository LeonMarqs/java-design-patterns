package br.com.designpattern.observer.WeatherChangesJavaBean.subject;

import br.com.designpattern.observer.WeatherChangesApp.observer.Observer;

public interface Subject {
	public void registerObserver(Observer observer);

	public void removeObserver(Observer observer);

	public void notifyObservers();
}
