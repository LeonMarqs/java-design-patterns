package br.com.designpattern.strategy.AdventureGame.weaponBehavior;

public class KnifeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("Cutting with a Knife");
	}

}
