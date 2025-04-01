package yugioh.monster;

import yugioh.card.Card;

public class DarkMagician extends Card {
	
	public DarkMagician (String name, String cardType, String attribute, String types, int level, double attack, double defense) {
		this.name = name;
		this.cardType = cardType;
		this.attribute = attribute;
		this.types = types;
		this.level = level;
		this.attack = attack;
		this.defense = defense;
	}
	
	public String description() {
		return "\nThe ultimate wizard in terms of attack and defense";
	}
	
	public String toString() {
		return String.format("Name: %s%nCard Type: %s%nAttribute: %s%nType: %s%nLevel: %d%nATK: %.0f%nDEF: %.0f%nType: %s%nDescription: %s%n", 
				getName(), getCardType(),getAttribute(), getTypes(), getLevel(), getAttack(),
				getDefense(), getTypes(), description());
	}
	
}
