package yugioh.monster;

import yugioh.card.Card;

public class SummonedSkull extends Card {


	public SummonedSkull(String name, String cardType, String attribute, String types, int level, double attack, double defense) {
		this.name = name;
		this.cardType = cardType;
		this.attribute = attribute;
		this.types = types;
		this.level = level;
		this.attack = attack;
		this.defense = defense;
	}
	
	public String description() {
		return "\nA fiend with dark powers for confusing the enemy. \n"
				+ "Among the Fiend-Type monsters, this monster \n"
				+ "boasts considerable force.";
	}
	
	public String toString() {
		return String.format("Name: %s%nCard Type: %s%nAttribute: %s%nType: %s%nLevel: %d%nATK: %.0f%nDEF: %.0f%nType: %s%nDescription: %s%n", 
				getName(), getCardType(),getAttribute(), getTypes(), getLevel(), getAttack(),
				getDefense(), getTypes(), description());
	}
}
