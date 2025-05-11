package lambdas.card;

public class Card {

	protected String name;
	protected double attack;
	protected double defense;
	protected int level;
	
	public Card() {
	}

	public Card(String name, double attack, double defense, int level) {
		super();
		this.name = name;
		setAttack(attack);
		this.defense = defense;
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (attack >= 0)
			this.name = name;
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

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
}
