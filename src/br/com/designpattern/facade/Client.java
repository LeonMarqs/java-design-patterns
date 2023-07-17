package br.com.designpattern.facade;

public class Client {
	public static void main(String[] args) {
		MusicPlayerFacade facade = new MusicPlayerFacade();
		facade.playMusic("Test Music", 80);
		facade.stopMusic();
	}
}
