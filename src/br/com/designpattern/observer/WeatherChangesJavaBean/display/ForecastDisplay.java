package br.com.designpattern.observer.WeatherChangesJavaBean.display;

import static br.com.designpattern.observer.WeatherChangesJavaBean.subject.WeatherData.PRESSURE;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ForecastDisplay implements PropertyChangeListener, DisplayElement {
	private float currentPressure = 29.92f;
	private float lastPressure;

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (PRESSURE.equals(evt.getPropertyName())) {
			this.lastPressure = currentPressure;
			this.currentPressure = (float) evt.getNewValue();
			display();
		}
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

}
