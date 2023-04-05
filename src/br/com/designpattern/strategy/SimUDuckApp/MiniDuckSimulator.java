package br.com.designpattern.strategy.SimUDuckApp;

import br.com.designpattern.strategy.SimUDuckApp.ducks.Duck;
import br.com.designpattern.strategy.SimUDuckApp.ducks.MallardDuck;
import br.com.designpattern.strategy.SimUDuckApp.ducks.ModelDuck;
import br.com.designpattern.strategy.SimUDuckApp.flyBehavior.FlyRocketPowered;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
