package br.com.designpattern.factory.pizzastore;

import br.com.designpattern.factory.pizzastore.pizzas.Pizza;
import br.com.designpattern.factory.pizzastore.stores.ChicagoStylePizzaStore;
import br.com.designpattern.factory.pizzastore.stores.NYStylePizzaStore;
import br.com.designpattern.factory.pizzastore.stores.PizzaStore;
import br.com.designpattern.factory.pizzastore.stores.PizzaStore.PizzaTypeEnum;

public class PizzaTestDrive {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYStylePizzaStore();
		PizzaStore chicagoStore = new ChicagoStylePizzaStore();
		
		Pizza pizza = nyStore.orderPizza(PizzaTypeEnum.CHEESE);
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		
		pizza = chicagoStore.orderPizza(PizzaTypeEnum.CHEESE);
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
	}
}
