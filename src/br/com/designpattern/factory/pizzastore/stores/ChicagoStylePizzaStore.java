package br.com.designpattern.factory.pizzastore.stores;

import br.com.designpattern.factory.pizzastore.pizzas.CheesePizza;
import br.com.designpattern.factory.pizzastore.pizzas.Pizza;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.factory.ChicagoPizzaIngredientFactory;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.factory.PizzaIngredientFactory;

public class ChicagoStylePizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(PizzaTypeEnum type) {
		Pizza pizza = null;
		PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
		
		if (PizzaTypeEnum.CHEESE.equals(type)) {
			pizza = new CheesePizza(pizzaIngredientFactory);
		} else if (PizzaTypeEnum.PEPPERONI.equals(type)) {
//			pizza = new ChicagoStylePepperoniPizza();
		} else if (PizzaTypeEnum.CLAM.equals(type)) {
//			pizza = new ChicagoStyleClamPizza();
		} else if (PizzaTypeEnum.VEGGIE.equals(type)) {
//			pizza = new ChicagoStyleVeggiePizza();
		}

		return pizza;
	}

}
