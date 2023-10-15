package br.com.designpattern.templatemethod.starbuzzcoffe.beveragewithhook;

public abstract class CaffeineBeverageWithHook {
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}

	abstract void brew();

	abstract void addCondiments();

	protected boolean customerWantsCondiments() {
		return true;
	}

	void boilWater() {
		System.out.println("Boiling water");
	}

	void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
