package br.com.designpattern.adapter.duck.adapters;

import br.com.designpattern.adapter.duck.Duck;
import br.com.designpattern.adapter.duck.Turkey;

public class DuckAdapter implements Turkey {

	private Duck duck;
	
	@Override
	public void gobble() {
		duck.fly();
	}

	@Override
	public void fly() {
		duck.fly(); //TODO: see how to implement it
	}

}
 