package br.com.designpattern.command.commands;

import br.com.designpattern.command.receiver.GarageDoor;

public class GarageDoorCloseCommand implements Command {
	
	public GarageDoor garageDoor;
	
	public GarageDoorCloseCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.down();
	}
	
	@Override
	public void undo() {
		garageDoor.up();
	}

}
