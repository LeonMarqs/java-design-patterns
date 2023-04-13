package br.com.designpattern.decorator.starbuzzcoffe;

import br.com.designpattern.decorator.starbuzzcoffe.beverage.Beverage;
import br.com.designpattern.decorator.starbuzzcoffe.beverage.Beverage.Size;
import br.com.designpattern.decorator.starbuzzcoffe.beverage.DarkRoast;
import br.com.designpattern.decorator.starbuzzcoffe.beverage.Espresso;
import br.com.designpattern.decorator.starbuzzcoffe.beverage.HouseBlend;
import br.com.designpattern.decorator.starbuzzcoffe.condiments.Mocha;
import br.com.designpattern.decorator.starbuzzcoffe.condiments.Soy;
import br.com.designpattern.decorator.starbuzzcoffe.condiments.Whip;

public class StarbuzzCoffe {
	public static void main(String[] args) {
		Beverage espresso = new Espresso();
		espresso = new Whip(espresso);
		System.out.println(espresso.getDescription() + " $" + espresso.cost());

		Beverage darkRoast = new DarkRoast(Size.GRANDE);
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Whip(darkRoast);
		System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());
		
		Beverage houseBlend = new HouseBlend(Size.VENTI);
		houseBlend = new Soy(houseBlend);
		houseBlend = new Mocha(houseBlend);
		houseBlend = new Whip(houseBlend);
		System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
	}
}
