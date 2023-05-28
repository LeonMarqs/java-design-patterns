package br.com.designpattern.factory.pizzastore.stores;

import br.com.designpattern.factory.pizzastore.pizzas.CheesePizza;
import br.com.designpattern.factory.pizzastore.pizzas.Pizza;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.factory.NYPizzaIngredientFactory;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.factory.PizzaIngredientFactory;

public class NYStylePizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(PizzaTypeEnum type) {
		Pizza pizza = null;
		PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

		if (PizzaTypeEnum.CHEESE.equals(type)) {
			pizza = new CheesePizza(pizzaIngredientFactory);
		} else if (PizzaTypeEnum.VEGGIE.equals(type)) {
//			pizza = new VeggiePizza(pizzaIngredientFactory);
		} else if (PizzaTypeEnum.CLAM.equals(type)) {
//			pizza = new ClamPizza(pizzaIngredientFactory);
		} else if (PizzaTypeEnum.VEGGIE.equals(type)) {
//			pizza = new PepperoniPizza(pizzaIngredientFactory);
		}

		return pizza;
	}

}
