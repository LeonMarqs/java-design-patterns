package br.com.designpattern.decorator.starbuzzcoffe.condiments;

import static br.com.designpattern.decorator.starbuzzcoffe.beverage.Beverage.Size.GRANDE;
import static br.com.designpattern.decorator.starbuzzcoffe.beverage.Beverage.Size.TALL;
import static br.com.designpattern.decorator.starbuzzcoffe.beverage.Beverage.Size.VENTI;

import br.com.designpattern.decorator.starbuzzcoffe.beverage.Beverage;

public class Soy extends CondimentDecorator {
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		double mochaCost = 0;
		Size beverageSize = beverage.getSize();
		if (TALL.equals(beverageSize)) {
			mochaCost = .12;
		} else if (GRANDE.equals(beverageSize)) {
			mochaCost = .17;
		} else if (VENTI.equals(beverageSize)) {
			mochaCost = .22;
		}
		
		return beverage.cost() + mochaCost;
	}

}
