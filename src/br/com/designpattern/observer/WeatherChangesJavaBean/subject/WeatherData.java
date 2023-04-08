package br.com.designpattern.observer.WeatherChangesJavaBean.subject;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class WeatherData {

	public static final String TEMPERATURE = "temperature";
	public static final String HUMIDITY = "humidity";
	public static final String PRESSURE = "pressure";
	
	private float temperature;
	private float humidity;
	private float pressure;
	private PropertyChangeSupport support;

	public WeatherData() {
		support = new PropertyChangeSupport(this);
	}

	public void addPropertyChangeListener(PropertyChangeListener pcl) {
		support.addPropertyChangeListener(pcl);
	}

	public void removePropertyChangeListener(PropertyChangeListener pcl) {
		support.removePropertyChangeListener(pcl);
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float newTemperature) {
		support.firePropertyChange("temperature", this.temperature, newTemperature);
		this.temperature = newTemperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float newHumidity) {
		support.firePropertyChange("humidity", this.humidity, newHumidity);
		this.humidity = newHumidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float newPressure) {
		support.firePropertyChange("pressure", this.pressure, newPressure);
		this.pressure = newPressure;
	}
}
