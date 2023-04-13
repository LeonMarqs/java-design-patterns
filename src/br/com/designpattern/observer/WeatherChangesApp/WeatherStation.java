package br.com.designpattern.observer.WeatherChangesApp;

import br.com.designpattern.observer.WeatherChangesApp.display.CurrentConditionsDisplay;
import br.com.designpattern.observer.WeatherChangesApp.display.ForecastDisplay;
import br.com.designpattern.observer.WeatherChangesApp.display.HeatIndexDisplay;
import br.com.designpattern.observer.WeatherChangesApp.display.StatisticsDisplay;
import br.com.designpattern.observer.WeatherChangesApp.subject.WeatherData;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		new CurrentConditionsDisplay(weatherData);
		new StatisticsDisplay(weatherData);
		new ForecastDisplay(weatherData);
		new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(20f, 66f, 30.4f);
		weatherData.setMeasurements(34f, 54f, 21.4f);
		weatherData.setMeasurements(25f, 57f, 44.4f);
	}
}
