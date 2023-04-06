package br.com.designpattern.observer.WeatherChangesApp.display;

import br.com.designpattern.observer.WeatherChangesApp.observer.Observer;
import br.com.designpattern.observer.WeatherChangesApp.subject.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
	private Float currentPressure = 29.92f;
	private Float lastPressure;
	private WeatherData weatherData;

	public ForecastDisplay(WeatherData weatherData) {
		this.setWeatherData(weatherData);
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

	@Override
	public void update(Float temp, Float humidity, Float pressure) {
		this.lastPressure = currentPressure;
		this.currentPressure = pressure;
		display();
	}

	public WeatherData getWeatherData() {
		return weatherData;
	}

	public void setWeatherData(WeatherData weatherData) {
		this.weatherData = weatherData;
	}

}
