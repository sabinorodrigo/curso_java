package lambdas.monster;

import lambdas.card.Card;

public class SummonedSkull extends Card {


	public SummonedSkull(String name, double attack, double defense, int level) {
		super(name, attack, defense, level);
	}
	
	public String description() {
		return "\nA fiend with dark powers for confusing the enemy. \n"
				+ "Among the Fiend-Type monsters, this monster \n"
				+ "boasts considerable force.";
	}
	
	public String toString() {
		return String.format("Name: %s%nAttack: %.0f%nDefense: %.0f%nLevel: %d%n", getName(), getAttack(), getDefense(), getLevel());
	}
}
