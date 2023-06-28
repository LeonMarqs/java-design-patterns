package br.com.designpattern.command.receiver;

public class Hottub {
	private float temperature;

	public void on() {
		System.out.println("Hot tub on");
	}

	public void off() {
		System.out.println("Hot tub off");
	}

	public void circulate() {
		System.out.println("Hot tub circulate");
	}

	public void jetsOn() {
		System.out.println("Hot tub jets on");
	}

	public void jetsOff() {
		System.out.println("Hot tub jets off");
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
		System.out.println("Hot tub temperature is: " + temperature);
	}
}
