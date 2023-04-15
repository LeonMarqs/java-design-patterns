package br.com.designpattern.decorator.starbuzzcoffe.condiments;

import static br.com.designpattern.decorator.starbuzzcoffe.beverage.Beverage.Size.GRANDE;
import static br.com.designpattern.decorator.starbuzzcoffe.beverage.Beverage.Size.TALL;
import static br.com.designpattern.decorator.starbuzzcoffe.beverage.Beverage.Size.VENTI;

import br.com.designpattern.decorator.starbuzzcoffe.beverage.Beverage;

public class Whip extends CondimentDecorator {
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		double mochaCost = 0;
		Size beverageSize = beverage.getSize();
		if (TALL.equals(beverageSize)) {
			mochaCost = .8;
		} else if (GRANDE.equals(beverageSize)) {
			mochaCost = .13;
		} else if (VENTI.equals(beverageSize)) {
			mochaCost = .18;
		}
		
		return beverage.cost() + mochaCost;
	}

}
