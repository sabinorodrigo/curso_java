package arrays;

public class ArraysInArrays {

	public static void main(String[] args) {
		
		String[] cards = { "Dark Magician", "Dark Magician Girl", "Magician of Black Chaos"};
		
		for (int i = 0; i < cards.length; i++) {
			
			for (int j = 0; j < cards.length; j++) {
				System.out.println(cards[i]);
			}
		}
 	}
}
