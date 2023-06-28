package br.com.designpattern.command.receiver;

public class Light {
	private ReceiverLocationEnum location;

	public Light(ReceiverLocationEnum location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location.toString() + " light is on");
	}

	public void off() {
		System.out.println(location.toString() + " light is off");
	}
	
	public void dim() {
		System.out.println(location.toString() + " light dim");
	}
}
