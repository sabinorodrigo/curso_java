package lambdas.monster;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		
		Function<DarkMagician, String> darkMagician = 
				card -> card.getAttack() < card.getAttack() ? "Monster destruido" : "Seu monstro morreu";
	
		System.out.println(darkMagician.apply(null));
	}
}
