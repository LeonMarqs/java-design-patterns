package br.com.designpattern.command.commands;

import br.com.designpattern.command.receiver.Light;

public class LightOffCommand implements Command {
	
	private Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}
	
//	@Override
//	public void undo() {
//		light.on();
//	}
}
