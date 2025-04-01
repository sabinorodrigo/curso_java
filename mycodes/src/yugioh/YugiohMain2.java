package yugioh;

import java.util.ArrayList;
import java.util.List;

import yugioh.card.Card;
import yugioh.monster.CelticGuardian;
import yugioh.monster.DarkMagician;
import yugioh.monster.SummonedSkull;

public class YugiohMain2 {

	public static void main(String[] args) {
		

		Card summonedSkull = new SummonedSkull("Summoned Skull", "Monster", "Dark", "Fiend/Normal",
				6, 2500, 1200);
		
		Card darkMagician = new DarkMagician("Dark Magician", "Monster", "Dark", "Spellcaster"
				, 7, 2500, 2100);
		
		Card celticGuadian = new CelticGuardian("Celtic Guardian", "Monster", "Earth", "Warrior/Normal", 
				4, 1400, 1200);
		
		
		List<Card> listCards = new ArrayList<>();
		
		listCards.add(summonedSkull);
		listCards.add(darkMagician);
		listCards.add(celticGuadian);
		
		listCards.forEach(System.out::println);
	}
	
}
