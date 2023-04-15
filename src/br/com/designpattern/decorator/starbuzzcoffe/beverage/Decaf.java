package br.com.designpattern.decorator.starbuzzcoffe.beverage;

public class Decaf extends Beverage {
	public Decaf() {
		super.description = "Decaf Coffee";
	}

	public Decaf(Size size) {
		this();
		super.setSize(size);
	}

	@Override
	public double cost() {
		return .97;
	}
}
