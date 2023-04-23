package br.com.designpattern.factory.pizzastore.stores;

import br.com.designpattern.factory.pizzastore.pizzas.Pizza;
import br.com.designpattern.factory.pizzastore.pizzas.newyork.NYStyleCheesePizza;
import br.com.designpattern.factory.pizzastore.pizzas.newyork.NYStyleClamPizza;
import br.com.designpattern.factory.pizzastore.pizzas.newyork.NYStylePepperoniPizza;
import br.com.designpattern.factory.pizzastore.pizzas.newyork.NYStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(PizzaTypeEnum type) {
		Pizza pizza = null;
		if (PizzaTypeEnum.CHEESE.equals(type)) {
			pizza = new NYStyleCheesePizza();
		} else if (PizzaTypeEnum.PEPPERONI.equals(type)) {
			pizza = new NYStylePepperoniPizza();
		} else if (PizzaTypeEnum.CLAM.equals(type)) {
			pizza = new NYStyleClamPizza();
		} else if (PizzaTypeEnum.VEGGIE.equals(type)) {
			pizza = new NYStyleVeggiePizza();
		}

		return pizza;
	}

}
