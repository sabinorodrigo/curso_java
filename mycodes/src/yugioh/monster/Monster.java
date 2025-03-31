package yugioh.monster;

public class Monster {

	private String name;
	private int attack;
	private int defense;
	private String type;
	
	public Monster() {
	}

	public Monster(String name, int attack, int defense, String type) {
		this.name = name;
		this.attack = attack;
		this.defense = defense;
		this.type = type;
	}
	
	public String toString() {
		return String.format("Name: %s%nATK: %d%nDEF: %d%nType: %s%n", 
				getName(), getAttack(), getDefense(), getType());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
