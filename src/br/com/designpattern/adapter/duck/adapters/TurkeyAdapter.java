package br.com.designpattern.adapter.duck.adapters;

import br.com.designpattern.adapter.duck.Duck;
import br.com.designpattern.adapter.duck.Turkey;

public class TurkeyAdapter implements Duck {
	private Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		super();
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for (int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}

}
