package arrays;

public class ArraysDeStrings {

	public static void main(String[] args) {
		
		String[] nomes = { "Dark ", "Summoned ", "Magician", "Skull",
				"Celtic ", "Blue-Eyes ", "Guardian", "White Dragon" };
		
		String celticGuardian = nomes[4].concat(nomes[6]);
		System.out.println(celticGuardian);
		
		String darkMagician = nomes[0].concat(nomes[2]);
		System.out.println(darkMagician);
		
		String summonedSkull = nomes[1].concat(nomes[3]);
		System.out.println(summonedSkull);
		
		String blueEyesWhiteDragon = nomes[5].concat(nomes[7]);
		System.out.println(blueEyesWhiteDragon);
		
		System.out.println();
		
		String[] monsters = { blueEyesWhiteDragon, celticGuardian, darkMagician, summonedSkull };
		
		for (String monster : monsters) {
			System.out.println(monster);
		}
	}
}
