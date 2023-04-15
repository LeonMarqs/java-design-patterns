package br.com.designpattern.decorator.starbuzzcoffe.beverage;

public class Espresso extends Beverage {
	
	public Espresso() {
		super.description = "Espresso";
	}
	
	public Espresso(Size size) {
		this();
		super.setSize(size);
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
