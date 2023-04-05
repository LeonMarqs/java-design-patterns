package br.com.designpattern.strategy.AdventureGame.weaponBehavior;

public class AxeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("Chopping with an Axe");
	}

}
