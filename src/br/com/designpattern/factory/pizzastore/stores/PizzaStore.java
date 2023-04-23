package br.com.designpattern.factory.pizzastore.stores;

import br.com.designpattern.factory.pizzastore.pizzas.Pizza;

public abstract class PizzaStore {

	public static enum PizzaTypeEnum {
		VEGGIE, CHEESE, PEPPERONI, CLAM
	}

	public Pizza orderPizza(PizzaTypeEnum type) {
		Pizza pizza;

		pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	protected abstract Pizza createPizza(PizzaTypeEnum type);
}
