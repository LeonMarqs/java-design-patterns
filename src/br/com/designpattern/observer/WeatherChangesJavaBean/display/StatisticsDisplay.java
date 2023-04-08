package br.com.designpattern.observer.WeatherChangesJavaBean.display;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class StatisticsDisplay implements PropertyChangeListener, DisplayElement {

	private Float maxTemp = 0.0f;
	private Float minTemp = 200f;
	private Float tempSum = 0.0f;
	private int numReadings;

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (!evt.getPropertyName()
				.equals(br.com.designpattern.observer.WeatherChangesJavaBean.subject.WeatherData.TEMPERATURE)) {
			return;
		}
		this.update((Float) evt.getNewValue());
	}

	public void update(Float temperature) {
		tempSum += temperature;
		numReadings++;

		if (temperature > maxTemp) {
			this.maxTemp = temperature;
		}

		if (temperature < minTemp) {
			this.minTemp = temperature;
		}

		display();
	}

	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
	}

}
