package br.com.designpattern.factory.pizzastore.pizzas;

import br.com.designpattern.factory.pizzastore.pizzas.ingredients.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
	private PizzaIngredientFactory ingredientFactory;

	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		this.dough = ingredientFactory.createDough();
		this.sauce = ingredientFactory.createSauce();
		this.cheese = ingredientFactory.createCheese();
	}

}
