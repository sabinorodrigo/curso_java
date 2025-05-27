package model.cards;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "card")
public class Card {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String cardType;

	private String attribute;

	private String types;

	private int level;

	private double attack;

	private double defense;

	private int passcode;
	
	private String cardEffectTypes;
	
	private String fusionMaterial;
	
	private String materials;

	private String statuses;

	public Card() {
	}
	
	public Card(String name, String cardType, String attribute, 
			String types, int level, double attack, 
			double defense, int passcode, String statuses) {
		this.name = name;
		this.cardType = cardType;
		this.attribute = attribute;
		this.types = types;
		this.level = level;
		this.setAttack(attack);
		this.setDefense(defense);
		this.passcode = passcode;
		this.statuses = statuses;
	}
	
	@Override
	public String toString() {
		String format = "\nName: %s\nCard Type: %s\nAttribute: %s\nTypes: %s\nLevel: %d\nAttack: %.0f\nDefense: %.0f\nPasscode: %d\nStatuses: %s\n";
		return String.format(format, getName(), getCardType(), getAttribute(), getTypes(), getLevel(), getAttack(), getDefense(), getPasscode(), getStatuses());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getAttack() {
		return attack;
	}

	public void setAttack(double attack) {
		this.attack = attack;
	}

	public double getDefense() {
		return defense;
	}

	public void setDefense(double defense) {
		this.defense = defense;
	}

	public int getPasscode() {
		return passcode;
	}

	public void setPasscode(int passcode) {
		this.passcode = passcode;
	}
	
	public String getCardEffectTypes() {
		return cardEffectTypes;
	}
	
	public void setCardEffectTypes(String cardEffectTypes) {
		this.cardEffectTypes = cardEffectTypes;
	}

	public String getStatuses() {
		return statuses;
	}

	public void setStatuses(String statuses) {
		this.statuses = statuses;
	}

}
