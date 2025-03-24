package yugioh;

import java.util.ArrayList;
import java.util.List;

public class YugiohMain {

	public static void main(String[] args) {
		Monster celticGuardian = new Monster("Celtic Guardian", 1400, 1200, "Warrior/Normal");
		Monster darkMagician = new Monster("Dark Magician", 2500, 2100, "Spellcaster/Normal");
		Monster summonedSkull = new Monster("Summoned Skull", 2500, 1200, "Fiend/Normal");
		Monster gaiaTheFierceKnight = new Monster("Gaia the Fierce Knight", 2300, 2100, "Warrior/Normal");
		//System.out.println(celticGuardian);
		
		List<Monster> monsterList = new ArrayList<>();
		
		monsterList.add(celticGuardian);
		monsterList.add(darkMagician);
		monsterList.add(summonedSkull);
		monsterList.add(gaiaTheFierceKnight);
		
		monsterList.forEach(System.out::println);
		
	}
}
