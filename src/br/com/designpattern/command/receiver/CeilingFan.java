package br.com.designpattern.command.receiver;

public class CeilingFan {
	ReceiverLocationEnum location;
	FanSpeed speed;
	
	public enum FanSpeed {
		OFF, LOW, MEDIUM, HIGH
	}
	
	public CeilingFan(ReceiverLocationEnum location) {
		this.location = location;
		this.setOff();
	}

	public void on() {
		System.out.println(location.toString() + " ceiling fan on");
	}

	public void setOff() {
		this.setSpeed(FanSpeed.OFF);
		System.out.println(location.toString() + " ceiling fan off");
	}

	public void setLow() {
		this.setSpeed(FanSpeed.LOW);
		System.out.println(location.toString() + " ceiling fan speed is high");
	}
	
	public void setMedium() {
		this.setSpeed(FanSpeed.MEDIUM);
		System.out.println(location.toString() + " ceiling fan speed is medium");
	}
	
	public void setHigh() {
		this.setSpeed(FanSpeed.HIGH);
		System.out.println(location.toString() + " ceiling fan speed is high");
	}

	public FanSpeed getSpeed() {
		return speed;
	}

	private void setSpeed(FanSpeed speed) {
		this.speed = speed;
	}
}
