package br.com.designpattern.strategy.AdventureGame.character;

import br.com.designpattern.strategy.AdventureGame.weaponBehavior.WeaponBehavior;

public abstract class Character {
	WeaponBehavior weapon;
	
	public abstract void fight();
	
	public void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}
	
	public void useWeapon() {
		this.weapon.useWeapon();
	}
}
