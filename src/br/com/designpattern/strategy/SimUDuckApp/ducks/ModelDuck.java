package br.com.designpattern.strategy.SimUDuckApp.ducks;

import br.com.designpattern.strategy.SimUDuckApp.flyBehavior.FlyNoWay;
import br.com.designpattern.strategy.SimUDuckApp.quackBehavior.Quack;

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
