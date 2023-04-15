package br.com.designpattern.decorator.starbuzzcoffe.beverage;

public class HouseBlend extends Beverage {
	
	public HouseBlend() {
		super.description = "House Blend Coffee";
	}
	
	public HouseBlend(Size size) {
		this();
		super.setSize(size);
	}

	@Override
	public double cost() {
		return .89;
	}

}
