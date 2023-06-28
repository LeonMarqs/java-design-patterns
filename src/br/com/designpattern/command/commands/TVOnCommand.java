package br.com.designpattern.command.commands;

import br.com.designpattern.command.receiver.TV;

public class TVOnCommand implements Command {

	private TV tv;

	public TVOnCommand(TV tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.on();
	}

	@Override
	public void undo() {
		tv.off();
	}
	// TODO: TVOFFcommand e HotTub on/off commands
}
