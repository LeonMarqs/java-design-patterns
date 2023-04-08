package br.com.designpattern.observer.WeatherChangesJavaBean.display;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Field;

public class CurrentConditionsDisplay implements PropertyChangeListener, DisplayElement {

	private float temperature;
	private float humidity;

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		try {
			Field fieldClass = this.getClass().getDeclaredField(evt.getPropertyName());
			fieldClass.setFloat(this, (float) evt.getNewValue());
			display();
		} catch (Exception e) {
			return;
		}
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "C° degrees and " + humidity + "% humidity");
	}

}
