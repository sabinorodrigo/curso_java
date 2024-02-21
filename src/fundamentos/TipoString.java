package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		System.out.println("Celtc Guardian".charAt(8));
		
		String d = "Dark Magician";
		d = d.concat(", attack with, dark magic attack!!!");
		System.out.println(d.toUpperCase());
		System.out.println(d.startsWith("Dark"));
		System.out.println(d.startsWith("dark"));
		System.out.println(d.toLowerCase().startsWith("dark"));
		System.out.println(d.toLowerCase().endsWith("attack"));
		System.out.println(d.length());
		System.out.println(d.equals("dark magician"));
		d = "Dark Magician";
		System.out.println(d.equalsIgnoreCase("dark magician"));
		
		System.out.println();
		
		var nome = "Gaia";
		var sobrenome = "the Fierce Knight";
		var attack = 2300;
		var defense = 2100;
		
		String maisUmaFrase = "Nome: " + nome + "\nSobrenome: "
				+ sobrenome + "\nAttack: " + attack +
				"\nDefense: " + defense;
		
		System.out.println(maisUmaFrase);
		System.out.println();
		
		System.out.println("Nome: " + nome + "\nSobrenome: "
				+ sobrenome + "\nAttack: " + attack +
				"\nDefense: " + defense);
		
		System.out.println();

		System.out.printf("The %s %s have attack of %d and %d of defense.\n\n\n", 
				nome, sobrenome, attack, defense);
		
		String frase = String.format("The %s %s have attack of %d and %d of defense.\n\n\n", 
				nome, sobrenome, attack, defense);
		
		System.out.println(frase);
		
		System.out.println("Blue-Eyes White Dragon".contains("eyes"));
		System.out.println("Blue-Eyes White Dragon".toLowerCase().indexOf("eyes"));
		System.out.println("Blue-Eyes White Dragon".substring(5));
		System.out.println("Blue-Eyes White Dragon".substring(5, 8));
	}

}
