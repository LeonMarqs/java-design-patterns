package br.com.designpattern.strategy.AdventureGame.weaponBehavior;

public class SwordBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("Swinging a Sword");
	}

}
