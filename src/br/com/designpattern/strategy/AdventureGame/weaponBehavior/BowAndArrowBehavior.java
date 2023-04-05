package br.com.designpattern.strategy.AdventureGame.weaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("Shooting with an Bow and Arrow");
	}

}
