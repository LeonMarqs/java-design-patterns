package br.com.designpattern.observer.WeatherChangesJavaBean;

import br.com.designpattern.observer.WeatherChangesJavaBean.display.CurrentConditionsDisplay;
import br.com.designpattern.observer.WeatherChangesJavaBean.subject.WeatherData;

public class WeatherStationBean {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();

		weatherData.addPropertyChangeListener(currentDisplay);

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
