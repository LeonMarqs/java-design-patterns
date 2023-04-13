package br.com.designpattern.decorator.starbuzzcoffe.beverage;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		super.description = "Dark Roast Coffee";
	}
	
	public DarkRoast(Size size) {
		this();
		super.setSize(size);
	}

	@Override
	public double cost() {
		return 1.67;
	}

}
