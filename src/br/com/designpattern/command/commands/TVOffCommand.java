package br.com.designpattern.command.commands;

import br.com.designpattern.command.receiver.TV;

public class TVOffCommand implements Command {

	private TV tv;

	public TVOffCommand(TV tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.off();
	}

	@Override
	public void undo() {
		tv.on();
	}

}
