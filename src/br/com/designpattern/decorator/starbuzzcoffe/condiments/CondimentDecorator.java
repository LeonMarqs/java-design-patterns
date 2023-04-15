package br.com.designpattern.decorator.starbuzzcoffe.condiments;

import br.com.designpattern.decorator.starbuzzcoffe.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
	@Override
	public abstract String getDescription();
}
