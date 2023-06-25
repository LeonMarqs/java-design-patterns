package br.com.designpattern.command.invoker;

import br.com.designpattern.command.commands.Command;

public class SimpleRemoteControl {
	Command slot;
	
	public SimpleRemoteControl() {}
	
	public void setCommand(Command command) {
		slot = command;
	}
	
	public void buttonWasPressed() {
		slot.execute();
	}
	
}