package br.com.designpattern.command.invoker;

import br.com.designpattern.command.commands.Command;
import br.com.designpattern.command.commands.NoCommand;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Command lastCommandExecuted;

	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];

		Command noCommand = new NoCommand();

		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}

		lastCommandExecuted = noCommand;
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		this.onCommands[slot] = onCommand;
		this.offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		Command command = this.onCommands[slot];
		command.execute();
		this.lastCommandExecuted = command;
	}

	public void offButtonWasPushed(int slot) {
		Command command = this.offCommands[slot];
		command.execute();
		this.lastCommandExecuted = command;
	}

	public void undoButtonWasPushed() {
		lastCommandExecuted.undo();
	}

	@Override
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n-------- Remote Control --------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getSimpleName() + "     "
					+ offCommands[i].getClass().getSimpleName() + "\n");
		}

		return stringBuff.toString();
	}
}
