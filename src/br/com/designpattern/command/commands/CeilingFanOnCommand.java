package br.com.designpattern.command.commands;

import br.com.designpattern.command.receiver.CeilingFan;

public class CeilingFanOnCommand implements Command {

	private CeilingFan fan;

	public CeilingFanOnCommand(CeilingFan fan) {
		super();
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.on();
	}

//	@Override
//	public void undo() {
//		fan.setOff();
//	}

}
