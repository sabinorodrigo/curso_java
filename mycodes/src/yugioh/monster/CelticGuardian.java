package yugioh.monster;

import yugioh.card.Card;

public class CelticGuardian extends Card {

	public CelticGuardian(String name, String cardType, String attribute, String types, int level, double attack, double defense) {
		this.name = name;
		this.cardType = cardType;
		this.attribute = attribute;
		this.types = types;
		this.level = level;
		this.attack = attack;
		this.defense = defense;
	}
	
	public String description() {
		return "\nAn elf who learned to wield a sword, \n"
				+ "he baffles enemies with lightning-swift attacks";
	}
	
	public String toString() {
		return String.format("Name: %s%nCard Type: %s%nAttribute: %s%nType: %s%nLevel: %d%nATK: %.0f%nDEF: %.0f%nType: %s%nDescription: %s%n", 
				getName(), getCardType(),getAttribute(), getTypes(), getLevel(), getAttack(),
				getDefense(), getTypes(), description());
	}
}
