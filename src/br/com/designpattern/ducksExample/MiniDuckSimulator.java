package br.com.designpattern.ducksExample;

import br.com.designpattern.ducksExample.ducks.Duck;
import br.com.designpattern.ducksExample.ducks.MallardDuck;
import br.com.designpattern.ducksExample.ducks.ModelDuck;
import br.com.designpattern.ducksExample.flyBehavior.FlyRocketPowered;

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
