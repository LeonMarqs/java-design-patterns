package br.com.designpattern.observer.WeatherChangesApp.subject;

import java.util.ArrayList;
import java.util.List;

import br.com.designpattern.observer.WeatherChangesApp.observer.Observer;

public class WeatherData implements Subject {

	private List<Observer> observers = new ArrayList<>();
	private Float temperature;
	private Float humidity;
	private Float pressure;

	@Override
	public void registerObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int i = observers.indexOf(observer);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		observers.forEach(observer -> {
			observer.update(temperature, humidity, pressure);
		});
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(Float temp, Float humidity, Float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
