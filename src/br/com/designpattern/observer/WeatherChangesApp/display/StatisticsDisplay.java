package br.com.designpattern.observer.WeatherChangesApp.display;

import br.com.designpattern.observer.WeatherChangesApp.observer.Observer;
import br.com.designpattern.observer.WeatherChangesApp.subject.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {

	private Float maxTemp = 0.0f;
	private Float minTemp = 200f;
	private Float tempSum= 0.0f;
	private int numReadings;
	private WeatherData weatherData;

	public StatisticsDisplay(WeatherData weatherData) {
		this.setWeatherData(weatherData);
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(Float temp, Float humidity, Float pressure) {
		tempSum += temp;
		numReadings++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}
 
		if (temp < minTemp) {
			minTemp = temp;
		}

		display();
	}

	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}

	public WeatherData getWeatherData() {
		return weatherData;
	}

	public void setWeatherData(WeatherData weatherData) {
		this.weatherData = weatherData;
	}

}
