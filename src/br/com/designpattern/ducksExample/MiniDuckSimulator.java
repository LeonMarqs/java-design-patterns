package br.com.designpattern.ducksExample;

import br.com.designpattern.ducksExample.ducks.Duck;
import br.com.designpattern.ducksExample.ducks.MallardDuck;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
	}
}
