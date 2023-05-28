package br.com.designpattern.factory.pizzastore.pizzas.ingredients.factory;

import br.com.designpattern.factory.pizzastore.pizzas.ingredients.implementations.FrozenClams;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.implementations.MozzarellaCheese;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.implementations.PlumTomatoSauce;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.implementations.SlicedPepperoni;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.implementations.ThickCrustDough;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.implementations.veggies.BlackOlives;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.implementations.veggies.EggPlant;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.implementations.veggies.Spinach;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.interfaces.Cheese;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.interfaces.Clams;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.interfaces.Dough;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.interfaces.Pepperoni;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.interfaces.Sauce;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.interfaces.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = { new BlackOlives(), new Spinach(), new EggPlant() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FrozenClams();
	}

}
