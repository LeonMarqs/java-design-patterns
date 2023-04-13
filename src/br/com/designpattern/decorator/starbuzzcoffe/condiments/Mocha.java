package br.com.designpattern.decorator.starbuzzcoffe.condiments;

import static br.com.designpattern.decorator.starbuzzcoffe.beverage.Beverage.Size.GRANDE;
import static br.com.designpattern.decorator.starbuzzcoffe.beverage.Beverage.Size.TALL;
import static br.com.designpattern.decorator.starbuzzcoffe.beverage.Beverage.Size.VENTI;

import br.com.designpattern.decorator.starbuzzcoffe.beverage.Beverage;

public class Mocha extends CondimentDecorator {
	Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		double mochaCost = 0;
		Size beverageSize = beverage.getSize();
		if (TALL.equals(beverageSize)) {
			mochaCost = .10;
		} else if (GRANDE.equals(beverageSize)) {
			mochaCost = .15;
		} else if (VENTI.equals(beverageSize)) {
			mochaCost = .20;
		}
		
		return beverage.cost() + mochaCost;
	}

}
