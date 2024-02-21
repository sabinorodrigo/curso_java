package fundamentos;

public class TipoString2 {

	public static void main(String[] args) {
		
		String card = "Magician of Black Chaos";
		card = card.concat(", and Dark Magician Girl");
		System.out.println(card);
		
		String card2 = "Blue-Eyes White Dragon";

		System.out.println(card2.length());
		System.out.println(card2.toUpperCase());
		
		String attackName = ", attack Proton Explosion";
		
		card2 = card2.concat(attackName).toUpperCase();
		
		System.out.println(card2);
		System.out.println(card2.length());
		
		card2 = "Blue-Eyes White Dragon";
		card2 = card2.replace("White Dragon", "Ultimate Dragon");
		System.out.println(card2);
		
		String card3 = "Celtic Guardian";
		String card4 = "Celtic Guardian";
		System.out.println(card3.endsWith("ian"));
		System.out.println(card3.startsWith("Cel"));
		System.out.println(card3.startsWith(card4));
		System.out.println(card3.equals(card4));
		System.out.println(card3.equals("celtic guardian"));
		System.out.println(card3.toLowerCase().equals("celtic guardian"));
		System.out.println(card3.equalsIgnoreCase("celtic guardian"));
	}

}
