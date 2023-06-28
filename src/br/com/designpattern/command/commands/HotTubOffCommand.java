package br.com.designpattern.command.commands;

import br.com.designpattern.command.receiver.Hottub;

public class HotTubOffCommand implements Command {

	private Hottub hotTub;

	public HotTubOffCommand(Hottub hotTub) {
		super();
		this.hotTub = hotTub;
	}

	@Override
	public void execute() {
		hotTub.off();
	}

//	@Override
//	public void undo() {
//		hotTub.on();
//	}

}
