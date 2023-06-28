package br.com.designpattern.command.receiver;

public class TV {
	private String inputChannel;
	private int volume;
	private ReceiverLocationEnum location;

	public TV(ReceiverLocationEnum location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location.toString() + " TV is on");
	}

	public void off() {
		System.out.println(location.toString() + " TV is off");
	}

	public void setInputChannel(String inputChannel) {
		this.inputChannel = inputChannel;
		System.out.println(location.toString() + " TV Input channel is " + inputChannel);
	}

	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println(location.toString() + " TV volume is " + volume);
	}

	public String getInputChannel() {
		return inputChannel;
	}

	public int getVolume() {
		return volume;
	}
}
