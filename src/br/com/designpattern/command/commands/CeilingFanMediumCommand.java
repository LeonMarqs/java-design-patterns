package br.com.designpattern.command.commands;

import br.com.designpattern.command.receiver.CeilingFan;
import br.com.designpattern.command.receiver.CeilingFan.FanSpeed;

public class CeilingFanMediumCommand implements Command {

	private CeilingFan fan;
	private FanSpeed fanPreviousSpeed;

	public CeilingFanMediumCommand(CeilingFan fan) {
		super();
		this.fan = fan;
	}

	@Override
	public void execute() {
		fanPreviousSpeed = fan.getSpeed();
		fan.setMedium();
	}

	@Override
	public void undo() {
		if (FanSpeed.HIGH.equals(fanPreviousSpeed)) {
			fan.setHigh();
		}
		if (FanSpeed.MEDIUM.equals(fanPreviousSpeed)) {
			fan.setMedium();
		}
		if (FanSpeed.LOW.equals(fanPreviousSpeed)) {
			fan.setLow();
		}
		if (FanSpeed.OFF.equals(fanPreviousSpeed)) {
			fan.setOff();
		}
	}
}
