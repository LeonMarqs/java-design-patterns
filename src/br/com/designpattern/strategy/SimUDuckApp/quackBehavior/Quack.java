package br.com.designpattern.strategy.SimUDuckApp.quackBehavior;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack");
	}

}
