package br.com.designpattern.ducksExample.ducks;

import br.com.designpattern.ducksExample.flyBehavior.FlyNoWay;
import br.com.designpattern.ducksExample.quackBehavior.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a Model Duck");
	}

}
