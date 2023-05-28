package br.com.designpattern.factory.pizzastore.pizzas.ingredients.factory;

import br.com.designpattern.factory.pizzastore.pizzas.ingredients.implementations.FreshClams;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.implementations.MarinaraSauce;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.implementations.ReggianoCheese;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.implementations.SlicedPepperoni;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.implementations.ThinCrustDough;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.implementations.veggies.Garlic;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.implementations.veggies.Mushroom;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.implementations.veggies.Onion;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.implementations.veggies.RedPepper;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.interfaces.Cheese;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.interfaces.Clams;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.interfaces.Dough;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.interfaces.Pepperoni;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.interfaces.Sauce;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.interfaces.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}

}
