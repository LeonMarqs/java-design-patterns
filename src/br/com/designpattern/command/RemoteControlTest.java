package br.com.designpattern.command;

import static br.com.designpattern.command.receiver.ReceiverLocationEnum.LIVING_ROOM;

import br.com.designpattern.command.commands.GarageDoorOpenCommand;
import br.com.designpattern.command.commands.LightOnCommand;
import br.com.designpattern.command.invoker.SimpleRemoteControl;
import br.com.designpattern.command.receiver.GarageDoor;
import br.com.designpattern.command.receiver.Light;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light(LIVING_ROOM);

		GarageDoor garageDoor = new GarageDoor();

		LightOnCommand lightOnCommand = new LightOnCommand(light);
		remote.setCommand(lightOnCommand);
		remote.buttonWasPressed();

		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		remote.setCommand(garageDoorOpenCommand);
		remote.buttonWasPressed();
	}
}
