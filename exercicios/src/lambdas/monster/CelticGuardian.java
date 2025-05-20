package lambdas.monster;

import lambdas.card.Card;

public class CelticGuardian extends Card {

	public CelticGuardian(String name, double attack, double defense, int level) {
		super(name, attack, defense, level);
	}
	
	public String description() {
		return "\nAn elf who learned to wield a sword, \n"
				+ "he baffles enemies with lightning-swift attacks";
	}
	
	public String toString() {
		return String.format("Name: %s%nAttack: %.0f%nDefense: %.0f%nLevel: %d%n", getName(), getAttack(), getDefense(), getLevel());
	}
}
