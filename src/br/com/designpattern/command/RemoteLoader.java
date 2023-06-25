package br.com.designpattern.command;

import static br.com.designpattern.command.receiver.ReceiverLocationEnum.KITCHEN;
import static br.com.designpattern.command.receiver.ReceiverLocationEnum.LIVING_ROOM;

import br.com.designpattern.command.commands.CeilingFanOffCommand;
import br.com.designpattern.command.commands.CeilingFanOnCommand;
import br.com.designpattern.command.commands.GarageDoorCloseCommand;
import br.com.designpattern.command.commands.GarageDoorOpenCommand;
import br.com.designpattern.command.commands.LightOffCommand;
import br.com.designpattern.command.commands.LightOnCommand;
import br.com.designpattern.command.commands.StereoOffCommand;
import br.com.designpattern.command.commands.StereoOnWithCDCommand;
import br.com.designpattern.command.invoker.RemoteControl;
import br.com.designpattern.command.receiver.CeilingFan;
import br.com.designpattern.command.receiver.GarageDoor;
import br.com.designpattern.command.receiver.Light;
import br.com.designpattern.command.receiver.Stereo;

public class RemoteLoader {

	public static void main(String[] args) {
		// Invoker
		RemoteControl remoteControl = new RemoteControl();

		// Receivers
		Light livingRoomLight = new Light(LIVING_ROOM);
		Light kitchenLight = new Light(KITCHEN);
		CeilingFan ceilingFan = new CeilingFan(LIVING_ROOM);
		GarageDoor garageDoor = new GarageDoor();
		Stereo stereo = new Stereo(LIVING_ROOM);

		// Light commands
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

		// Ceiling Fan commands
		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

		// Garage Door commands
		GarageDoorOpenCommand garageDoorUp = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand garageDoorDown = new GarageDoorCloseCommand(garageDoor);

		// Stereo commands
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);

		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, garageDoorUp, garageDoorDown);
		remoteControl.setCommand(4, stereoOnWithCD, stereoOff);

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
