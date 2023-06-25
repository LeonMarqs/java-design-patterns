package br.com.designpattern.command.commands;

import br.com.designpattern.command.receiver.CeilingFan;

public class CeilingFanOffCommand implements Command {

	private CeilingFan fan;

	public CeilingFanOffCommand(CeilingFan fan) {
		super();
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.setOff();
	}
	
	@Override
	public void undo() {
		fan.on();
	}
}
