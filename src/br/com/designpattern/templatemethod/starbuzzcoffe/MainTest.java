package br.com.designpattern.templatemethod.starbuzzcoffe;

import br.com.designpattern.templatemethod.starbuzzcoffe.beverage.Coffee;
import br.com.designpattern.templatemethod.starbuzzcoffe.beverage.Tea;
import br.com.designpattern.templatemethod.starbuzzcoffe.beveragewithhook.CoffeeWithHook;
import br.com.designpattern.templatemethod.starbuzzcoffe.beveragewithhook.TeaWithHook;

public class MainTest {
	public static void main(String[] args) {
		Tea myTea = new Tea();

		myTea.prepareRecipe();

		Coffee myCoffe = new Coffee();
		myCoffe.prepareRecipe();

		// Tests with hook
		TeaWithHook myTeaWithHook = new TeaWithHook();
		myTeaWithHook.prepareRecipe();

		CoffeeWithHook myCoffeWithHook = new CoffeeWithHook();
		myCoffeWithHook.prepareRecipe();
	}
}
