package br.com.designpattern.command;

import static br.com.designpattern.command.receiver.ReceiverLocationEnum.LIVING_ROOM;

import br.com.designpattern.command.commands.Command;
import br.com.designpattern.command.commands.HotTubOffCommand;
import br.com.designpattern.command.commands.HotTubOnCommand;
import br.com.designpattern.command.commands.LightOffCommand;
import br.com.designpattern.command.commands.LightOnCommand;
import br.com.designpattern.command.commands.MacroCommand;
import br.com.designpattern.command.commands.StereoOffCommand;
import br.com.designpattern.command.commands.StereoOnWithCDCommand;
import br.com.designpattern.command.commands.TVOffCommand;
import br.com.designpattern.command.commands.TVOnCommand;
import br.com.designpattern.command.invoker.RemoteControl;
import br.com.designpattern.command.receiver.Hottub;
import br.com.designpattern.command.receiver.Light;
import br.com.designpattern.command.receiver.Stereo;
import br.com.designpattern.command.receiver.TV;

public class RemoteLoadederMacroCommand {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();

		Light light = new Light(LIVING_ROOM);
		TV tv = new TV(LIVING_ROOM);
		Stereo stero = new Stereo(LIVING_ROOM);
		Hottub hottub = new Hottub();

		LightOnCommand lightOn = new LightOnCommand(light);
		TVOnCommand tvOn = new TVOnCommand(tv);
		StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stero);
		HotTubOnCommand hottubOn = new HotTubOnCommand(hottub);

		LightOffCommand lightOff = new LightOffCommand(light);
		TVOffCommand tvOff = new TVOffCommand(tv);
		StereoOffCommand stereoOff = new StereoOffCommand(stero);
		HotTubOffCommand hottubOff = new HotTubOffCommand(hottub);

		Command[] partyOn = { lightOn, tvOn, stereoOn, hottubOn };
		Command[] partyOff = { lightOff, tvOff, stereoOff, hottubOff };

		MacroCommand partyOnCommand = new MacroCommand(partyOn);
		MacroCommand partyOffCommand = new MacroCommand(partyOff);

		remoteControl.setCommand(0, partyOnCommand, partyOffCommand);

		System.out.println(remoteControl);
		remoteControl.onButtonWasPushed(0);
		remoteControl.undoButtonWasPushed();

	}
}
