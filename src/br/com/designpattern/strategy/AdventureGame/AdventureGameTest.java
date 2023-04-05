package br.com.designpattern.strategy.AdventureGame;

import br.com.designpattern.strategy.AdventureGame.character.Character;
import br.com.designpattern.strategy.AdventureGame.character.King;
import br.com.designpattern.strategy.AdventureGame.weaponBehavior.AxeBehavior;
import br.com.designpattern.strategy.AdventureGame.weaponBehavior.SwordBehavior;

public class AdventureGameTest {
	public static void main(String[] args) {
		Character king = new King();
		king.setWeapon(new AxeBehavior());
		king.useWeapon();
		king.setWeapon(new SwordBehavior());
		king.useWeapon();
	}
}
