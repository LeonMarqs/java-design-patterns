package br.com.designpattern.command;

import static br.com.designpattern.command.receiver.ReceiverLocationEnum.LIVING_ROOM;

import br.com.designpattern.command.commands.CeilingFanHighCommand;
import br.com.designpattern.command.commands.CeilingFanMediumCommand;
import br.com.designpattern.command.commands.CeilingFanOffCommand;
import br.com.designpattern.command.invoker.RemoteControl;
import br.com.designpattern.command.receiver.CeilingFan;

public class RemoteLoaderFanSpeed {

	public static void main(String[] args) {
		// Invoker
		RemoteControl remoteControl = new RemoteControl();

		// Receivers
		CeilingFan ceilingFan = new CeilingFan(LIVING_ROOM);

		// Light commands
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

		remoteControl.setCommand(0, ceilingFanHigh, ceilingFanOff);
		remoteControl.setCommand(1, ceilingFanMedium, ceilingFanOff);

		System.out.println(remoteControl);

		remoteControl.onButtonWasPushed(0);
		remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(1);
	}

}
