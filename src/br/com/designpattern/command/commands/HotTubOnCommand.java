package br.com.designpattern.command.commands;

import br.com.designpattern.command.receiver.Hottub;

public class HotTubOnCommand implements Command {

	private Hottub hotTub;

	public HotTubOnCommand(Hottub hotTub) {
		super();
		this.hotTub = hotTub;
	}

	@Override
	public void execute() {
		hotTub.on();
	}

//	@Override
//	public void undo() {
//		hotTub.off();
//	}

}
