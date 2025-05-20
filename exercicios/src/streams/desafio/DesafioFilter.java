package streams.desafio;

import java.util.Arrays;
import java.util.List;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Carta darkMagian = new Carta("Dark Magician", 2500, 2100, "Spellcaster", "Dark");
		Carta summonedSkull = new Carta("Summoned Skull", 2500, 1200, "Fiend", "Dark");
		Carta celticGuardian = new Carta("Celtic Guardian", 1400, 1200, "Warrior", "Earth");
		Carta gaiaTheFierceKnight = new Carta("Gaia the Fierce knight", 2300, 2100, "Warrior", "Earth");
		Carta blackLusterSoldier = new Carta("Black Luster Soldier", 3000, 2500, "Warrior", "Earth");
		
		List<Carta> cartas = Arrays.asList(
				darkMagian, 
				summonedSkull, 
				celticGuardian, 
				gaiaTheFierceKnight,
				blackLusterSoldier
				);
		
		cartas.forEach(card -> System.out.println(card));
		
		cartas.stream()
			.filter(card -> card.getAtaque() < 2500)
			.filter(card -> card.getAtributo() == "Earth")
			.map(card -> card.getNome())
			.forEach(card -> System.out.println(card));
	}

}
