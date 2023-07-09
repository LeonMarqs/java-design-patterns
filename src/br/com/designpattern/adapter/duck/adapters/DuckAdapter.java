package br.com.designpattern.adapter.duck.adapters;

import java.util.Random;
import br.com.designpattern.adapter.duck.Duck;
import br.com.designpattern.adapter.duck.Turkey;

public class DuckAdapter implements Turkey {

	private Duck duck;
	Random rand;

	public DuckAdapter(Duck duck) {
		super();
		this.duck = duck;
		this.rand = new Random();
	}
  
	@Override
	public void gobble() {
		duck.fly();
	}

	@Override
	public void fly() {
		if (rand.nextInt(5) == 0) {
			duck.fly();
		}
	}

}
