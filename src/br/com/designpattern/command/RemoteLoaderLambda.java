package br.com.designpattern.command;

import static br.com.designpattern.command.receiver.ReceiverLocationEnum.KITCHEN;
import static br.com.designpattern.command.receiver.ReceiverLocationEnum.LIVING_ROOM;

import br.com.designpattern.command.commands.Command;
import br.com.designpattern.command.invoker.RemoteControl;
import br.com.designpattern.command.receiver.CeilingFan;
import br.com.designpattern.command.receiver.GarageDoor;
import br.com.designpattern.command.receiver.Light;
import br.com.designpattern.command.receiver.Stereo;

public class RemoteLoaderLambda {
	public static void main(String[] args) {
		// Invoker
		RemoteControl remoteControl = new RemoteControl();

		// Receivers
		Light livingRoomLight = new Light(LIVING_ROOM);
		Light kitchenLight = new Light(KITCHEN);
		CeilingFan ceilingFan = new CeilingFan(LIVING_ROOM);
		GarageDoor garageDoor = new GarageDoor();
		Stereo stereo = new Stereo(LIVING_ROOM);

		Command stereoOnWithCD = () -> {
			stereo.on();
			stereo.setCd();
			stereo.setVolume(11);
		};

		remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
		remoteControl.setCommand(1, kitchenLight::on, kitchenLight::off);
		remoteControl.setCommand(2, ceilingFan::on, ceilingFan::setOff);
		remoteControl.setCommand(3, garageDoor::up, garageDoor::down);
		remoteControl.setCommand(4, stereoOnWithCD, stereo::off);

		System.out.println(remoteControl);

		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(4);
		remoteControl.undoButtonWasPushed();
	}
}
