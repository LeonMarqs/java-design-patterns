package br.com.designpattern.ducksExample.quackBehavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak");
	}

}
