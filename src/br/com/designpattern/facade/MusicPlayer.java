package br.com.designpattern.facade;

public class MusicPlayer {
	public void initialize() {
		System.out.println("Player init");
	}

	public void selectTrack(String track) {
		System.out.println("Selecting music: " + track);
	}

	public void setVolume(int volume) {
		System.out.println("Adjusting volume to: " + volume);
	}

	public void play() {
		System.out.println("Playing music");
	}

	public void stop() {
		System.out.println("Stopping music");
	}
}
