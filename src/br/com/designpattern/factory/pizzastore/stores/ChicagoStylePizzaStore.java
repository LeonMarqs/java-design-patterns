package br.com.designpattern.factory.pizzastore.stores;

import br.com.designpattern.factory.pizzastore.pizzas.Pizza;
import br.com.designpattern.factory.pizzastore.pizzas.chicago.ChicagoStyleCheesePizza;
import br.com.designpattern.factory.pizzastore.pizzas.chicago.ChicagoStyleClamPizza;
import br.com.designpattern.factory.pizzastore.pizzas.chicago.ChicagoStylePepperoniPizza;
import br.com.designpattern.factory.pizzastore.pizzas.chicago.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(PizzaTypeEnum type) {
		Pizza pizza = null;
		if (PizzaTypeEnum.CHEESE.equals(type)) {
			pizza = new ChicagoStyleCheesePizza();
		} else if (PizzaTypeEnum.PEPPERONI.equals(type)) {
			pizza = new ChicagoStylePepperoniPizza();
		} else if (PizzaTypeEnum.CLAM.equals(type)) {
			pizza = new ChicagoStyleClamPizza();
		} else if (PizzaTypeEnum.VEGGIE.equals(type)) {
			pizza = new ChicagoStyleVeggiePizza();
		}

		return pizza;
	}

}
