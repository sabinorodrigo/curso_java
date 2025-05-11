package lambdas.monster;

import lambdas.card.Card;

public class DarkMagician extends Card {

	public DarkMagician(String nome, double attack, double defense, int level) {
		super(nome, attack, defense, level);
	}
	
	public String description() {
		return "\nThe ultimate wizard in terms of attack and defense";
	}
	
	public String toString() {
		return String.format("Name: %s%nAttack: %.0f%nDefense: %.0f%nLevel: %d%n", getName(), getAttack(), getDefense(), getLevel());
	}
}
