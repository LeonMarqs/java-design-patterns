package br.com.designpattern.command.commands;

import br.com.designpattern.command.receiver.GarageDoor;

public class GarageDoorOpenCommand implements Command {
	
	public GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.up();
	}
	
	
//	@Override
//	public void undo() {
//		garageDoor.down();
//	}

}
