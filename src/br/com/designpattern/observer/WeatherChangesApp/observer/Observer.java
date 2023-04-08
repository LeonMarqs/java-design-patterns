package br.com.designpattern.observer.WeatherChangesApp.observer;

public interface Observer {
	public void update(Float temp, Float humidity, Float pressure);
}
