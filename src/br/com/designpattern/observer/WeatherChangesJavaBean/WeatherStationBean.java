package br.com.designpattern.observer.WeatherChangesJavaBean;

import br.com.designpattern.observer.WeatherChangesJavaBean.display.CurrentConditionsDisplay;
import br.com.designpattern.observer.WeatherChangesJavaBean.display.ForecastDisplay;
import br.com.designpattern.observer.WeatherChangesJavaBean.display.HeatIndexDisplay;
import br.com.designpattern.observer.WeatherChangesJavaBean.display.StatisticsDisplay;
import br.com.designpattern.observer.WeatherChangesJavaBean.subject.WeatherData;

public class WeatherStationBean {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
		ForecastDisplay forecastDisplay = new ForecastDisplay();
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay();
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

		weatherData.addPropertyChangeListener(currentDisplay);
		weatherData.addPropertyChangeListener(forecastDisplay);
		weatherData.addPropertyChangeListener(heatIndexDisplay);
		weatherData.addPropertyChangeListener(statisticsDisplay);

		weatherData.setHumidity(345.4f);
		weatherData.setPressure(12.4f);
		weatherData.setTemperature(52.4f);

		weatherData.removePropertyChangeListener(currentDisplay);

		weatherData.setHumidity(314.4f);
		weatherData.setPressure(212.52f);
		
		weatherData.addPropertyChangeListener(currentDisplay);
		
		weatherData.setTemperature(56.4f);

	}
}
