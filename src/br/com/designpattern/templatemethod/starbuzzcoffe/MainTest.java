package br.com.designpattern.templatemethod.starbuzzcoffe;

import br.com.designpattern.templatemethod.starbuzzcoffe.beverage.Coffee;
import br.com.designpattern.templatemethod.starbuzzcoffe.beverage.Tea;

public class MainTest {
	public static void main(String[] args) {
		Tea myTea = new Tea();
		
		myTea.prepareRecipe();
		
		Coffee myCoffe = new Coffee();
		myCoffe.prepareRecipe();
	}
}
