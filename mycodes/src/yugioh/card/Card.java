package yugioh.card;

public abstract class Card {

	protected String name;
	protected String cardType;
	protected String attribute;
	protected String types;
	protected int level;
	protected double attack;
	protected double defense;
	protected long passcode;
	protected String cardDescription;

	public Card() {
	}

	public Card(String name, String cardType, String attribute, String types, int level, double attack, double defense,
			String cardDescription) {
		this.name = name;
		this.cardType = cardType;
		this.attribute = attribute;
		this.types = types;
		this.level = level;
		this.attack = attack;
		this.defense = defense;
		this.cardDescription = cardDescription;
	}

	public String toString() {
		return String.format("Name: %s%nCard Type: %s%nAttribute: %s%nType: %s%nLevel: %d%nATK: %.0f%nDEF: %.0f%nType: %s%nDescription: %s%n", 
				getName(), getCardType(),getAttribute(), getTypes(), getLevel(), getAttack(),
				getDefense(), getTypes(), getCardDescription());
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

	public long getPasscode() {
		return passcode;
	}

	public void setPasscode(long passcode) {
		this.passcode = passcode;
	}

	public String getCardDescription() {
		return cardDescription;
	}

	public void setCardDescription(String cardDescription) {
		this.cardDescription = cardDescription;
	}

}
