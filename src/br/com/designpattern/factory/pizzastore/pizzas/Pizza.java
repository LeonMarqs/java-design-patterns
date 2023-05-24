package br.com.designpattern.factory.pizzastore.pizzas;

import br.com.designpattern.factory.pizzastore.pizzas.ingredients.interfaces.Cheese;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.interfaces.Clams;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.interfaces.Dough;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.interfaces.Pepperoni;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.interfaces.Sauce;
import br.com.designpattern.factory.pizzastore.pizzas.ingredients.interfaces.Veggies;

public abstract class Pizza {
	protected String name;
	protected Sauce sauce;
	protected Dough dough;
	protected Veggies[] veggies;
	protected Cheese cheese;
	protected Pepperoni pepperoni;
	protected Clams clam;

	public abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
