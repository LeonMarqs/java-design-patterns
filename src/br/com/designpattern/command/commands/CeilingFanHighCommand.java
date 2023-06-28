package br.com.designpattern.command.commands;

import br.com.designpattern.command.receiver.CeilingFan;

public class CeilingFanHighCommand implements Command {

	private CeilingFan fan;
//	private FanSpeed fanPreviousSpeed;

	public CeilingFanHighCommand(CeilingFan fan) {
		super();
		this.fan = fan;
	}

	@Override
	public void execute() {
//		fanPreviousSpeed = fan.getSpeed();
		fan.setHigh();
	}

//	@Override
//	public void undo() {
//		if (FanSpeed.HIGH.equals(fanPreviousSpeed)) {
//			fan.setHigh();
//		}
//		if (FanSpeed.MEDIUM.equals(fanPreviousSpeed)) {
//			fan.setMedium();
//		}
//		if (FanSpeed.LOW.equals(fanPreviousSpeed)) {
//			fan.setLow();
//		}
//		if (FanSpeed.OFF.equals(fanPreviousSpeed)) {
//			fan.setOff();
//		}
//	}
}
