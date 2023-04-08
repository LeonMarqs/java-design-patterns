package br.com.designpattern.observer.WeatherChangesApp.display;

import br.com.designpattern.observer.WeatherChangesApp.observer.Observer;
import br.com.designpattern.observer.WeatherChangesApp.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private Float temperature;
	private Float humidity;
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.setWeatherData(weatherData);
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "C° degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(Float temp, Float humidity, Float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.display();
	}

	public Subject getWeatherData() {
		return weatherData;
	}

	public void setWeatherData(Subject weatherData) {
		this.weatherData = weatherData;
	}

}
