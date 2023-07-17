package br.com.designpattern.facade;

public class MusicPlayerFacade {
	private MusicPlayer player;

	public MusicPlayerFacade() {
		player = new MusicPlayer();
	}

	public void playMusic(String track, int volume) {
		player.initialize();
		player.selectTrack(track);
		player.setVolume(volume);
		player.play();
	}

	public void stopMusic() {
		player.stop();
	}
}
