package br.com.designpattern.factory.pizzastore.pizzas.ingredients.factory;

import br.com.designpattern.factory.pizzastore.pizzas.ingredients.interfaces.Cheese;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.interfaces.Clams;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.interfaces.Dough;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.interfaces.Pepperoni;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.interfaces.Sauce;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.interfaces.Veggies;

public interface PizzaIngredientFactory {
	public Dough createDough();

	public Sauce createSauce();

	public Cheese createCheese();

	public Veggies[] createVeggies();

	public Pepperoni createPepperoni();

	public Clams createClam();
}
