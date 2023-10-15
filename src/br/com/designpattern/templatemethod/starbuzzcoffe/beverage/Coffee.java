package br.com.designpattern.templatemethod.starbuzzcoffe.beverage;

public class Coffee extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("Dripping Coffe through filter");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}

}
