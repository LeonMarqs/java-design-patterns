package br.com.designpattern.command.receiver;

public class Stereo {
	private ReceiverLocationEnum location;

	public Stereo(ReceiverLocationEnum location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location.toString() + " stereo on");
	};

	public void off() {
		System.out.println(location.toString() + " stereo off");
	}

	public void setCd() {
		System.out.println(location.toString() + " stereo set CD");
	}

	public void setDvd() {
		System.out.println(location.toString() + " stereo set DVD");
	}

	public void setRadio() {
		System.out.println(location.toString() + " stereo set radio");
	}

	public void setVolume(int volume) {
		System.out.println(location.toString() + " stereo set volume " + volume);
	}
}
