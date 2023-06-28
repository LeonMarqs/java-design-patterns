package br.com.designpattern.command.commands;

import br.com.designpattern.command.receiver.Stereo;

public class StereoOffCommand implements Command {
	Stereo stereo;

	public StereoOffCommand(Stereo stereo) {
		super();
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.off();
	}

//	@Override
//	public void undo() {
//		stereo.on();
//	}

}
