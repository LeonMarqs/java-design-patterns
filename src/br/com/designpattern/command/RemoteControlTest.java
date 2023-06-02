package br.com.designpattern.command;

import br.com.designpattern.command.commands.LightOnCommand;
import br.com.designpattern.command.invoker.SimpleRemoteControl;
import br.com.designpattern.command.receiver.Light;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		remote.setCommand(lightOnCommand);
		
		remote.buttonWasPressed();
	}
}
